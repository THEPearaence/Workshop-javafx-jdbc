package model.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService implements Serializable{
	private static final long serialVersionUID = 1L;

	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(1,"Book"));
		list.add(new Department(2,"Computer"));
		list.add(new Department(3,"Eletronic"));
		return list;
	}
}
