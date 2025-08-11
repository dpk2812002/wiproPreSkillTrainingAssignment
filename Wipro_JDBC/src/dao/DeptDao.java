package dao;

import java.util.List;

import exception.DeptError;
import model.department;

public interface DeptDao {
	void addDepartment(department dept);
	department getDepartmentById(int id) throws DeptError;
    List<department> getAllDepartments();
    void updateDepartment(department dept) throws DeptError;
    void deleteDepartment(int id) throws DeptError;
 
}

