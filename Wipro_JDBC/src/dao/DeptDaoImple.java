package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.DeptError;
import model.department;
import util.DatabaseUtil;

public class DeptDaoImple implements DeptDao{

	
	public void addDepartment(department dept) {
		String smt = "INSERT INTO department VALUES (?, ?, ?)";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(smt)) {
            ps.setInt(1, dept.getDeptId());
            ps.setString(2, dept.getDeptName());
            ps.setString(3, dept.getLocation());
            ps.executeUpdate();
            System.out.println("Added successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}


	public department getDepartmentById(int id) throws DeptError {
		String smt = "SELECT * FROM department WHERE deptId=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(smt)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new department(rs.getInt(1), rs.getString(2), rs.getString(3));
            } else {
                throw new DeptError("Department with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            throw new DeptError("Error while fetching department.");
        }
	}



	public List<department> getAllDepartments() {
		List<department> list = new ArrayList<>();
	    String smt = "SELECT * FROM department";
	    
	    try (Connection con = DatabaseUtil.getConnection();
	         PreparedStatement ps = con.prepareStatement(smt);
	         ResultSet rs = ps.executeQuery()) {
	         
	        while (rs.next()) {
	            list.add(new department(rs.getInt(1), rs.getString(2), rs.getString(3)));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }    return list;
	}

	
	
	public void updateDepartment(department dept) throws DeptError {
		String smt = "UPDATE department SET deptName=?, location=? WHERE deptId=?";
        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(smt)) {
            ps.setString(1, dept.getDeptName());
            ps.setString(2, dept.getLocation());
            ps.setInt(3, dept.getDeptId());
            int rows = ps.executeUpdate();
            if (rows == 0) {
                throw new DeptError("No department found with ID " + dept.getDeptId());
            }
            System.out.println("Department updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	
	public void deleteDepartment(int id) throws DeptError {
	
		 String sql = "DELETE FROM department WHERE deptId=?";
	        try (Connection con = DatabaseUtil.getConnection();
	             PreparedStatement ps = con.prepareStatement(sql)) {
	            ps.setInt(1, id);
	            int rows = ps.executeUpdate();
	            if (rows == 0) {
	                throw new DeptError("No department found with ID " + id);
	            }
	            System.out.println("Department deleted.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	



