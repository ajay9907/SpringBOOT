
package com.SpringBoot15CRUD.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot15CRUD.DAO.EmployeeDAO;
import com.SpringBoot15CRUD.Entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;

	public Employee insertEmployee(Employee employee) {
		return dao.insertEmployee(employee);
	}

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public Employee getEmployeeById(Long id) {
		return dao.getEmployeeById(id);
	}

	public Employee updateEmployee(Long id, Employee employee) {
		return dao.updateEmployee(id, employee);
	}

	public void deleteEmployee(Long id) {
		dao.deleteEmployee(id);
	}
}
