package com.SpringBoot_Association_mapping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot_Association_mapping.DAO.DeptDAO;
import com.SpringBoot_Association_mapping.Entity.Dept;

@Service
public class DeptService {

	@Autowired
	private DeptDAO dao;

	public String insertData(Dept dept) {
		return dao.insertData(dept);
	}

	public List<Dept> getAllData() {
		return dao.getAllData();
	}

	public Dept getDataById(int id) {
		return dao.getDataById(id);
	}

	public String updateData(Dept dept, int id) {
		return dao.updateData(dept, id);
	}

	public String deleteData(int id) {
		return dao.deleteData(id);
	}
}