package com.SpringBoot_Association_mapping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_Association_mapping.DAO.DeptDAO;
import com.SpringBoot_Association_mapping.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	DeptDAO dao;

	public String insertData(Employee emp) {
		String msg = dao.insertData(emp);
		return msg;
	}

	public String updateData(Employee emp, int id) {
		String msg = dao.updateData(emp, id);
		return msg;
	}
}
