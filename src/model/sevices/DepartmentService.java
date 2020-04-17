package model.sevices;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	//Injetando dependencia do Department Dao
	private DepartmentDao dao = DaoFactory.createDepartmentDao();

	public List<Department> findAll(){
		return dao.findAll();
	}
}
