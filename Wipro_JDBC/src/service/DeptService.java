package service;

import java.util.List;
import dao.DeptDao;
import dao.DeptDaoImple;

import exception.DeptError;
import model.department;

public class DeptService {
	
	DeptDao dao = new DeptDaoImple();

    public void addDepartment(department dept) {
        dao.addDepartment(dept);
    }

    public department getDepartmentById(int id) throws DeptError {
        return dao.getDepartmentById(id);
    }

    public List<department> getAllDepartments() {
        return dao.getAllDepartments();
    }

    public void updateDepartment(department dept) throws DeptError {
        dao.updateDepartment(dept);
    }

    public void deleteDepartment(int id) throws DeptError {
        dao.deleteDepartment(id);
    }

}
