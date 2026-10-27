package com.SpringBoot_Association_mapping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_Association_mapping.DAO.EmployeeDAO;
import com.SpringBoot_Association_mapping.Entity.Dept;
import com.SpringBoot_Association_mapping.Entity.Employee;

@Service
public class DeptService {
	@Autowired
	EmployeeDAO dao;

	public String insertData(Dept dept) {

		String msg = dao.insertData(dept);
		return msg;
	}

	public String updateData(Dept dpt, int id) {
		String msg = dao.updateData(dpt, id);
		return msg;
	}

}
