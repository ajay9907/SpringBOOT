package com.SpringBoot_Association_mapping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_Association_mapping.DAO.EmployeeDAO;
import com.SpringBoot_Association_mapping.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	public String insertData(Employee emp) {
		return dao.insertData(emp);
	}

	public List<Employee> getAllData() {
		return dao.getAllData();
	}

	public Employee getDataById(int id) {
		return dao.getDataById(id);
	}

	public String updateData(Employee emp, int id) {
		return dao.updateData(emp, id);
	}

	public String deleteData(int id) {
		return dao.deleteData(id);
	}
}