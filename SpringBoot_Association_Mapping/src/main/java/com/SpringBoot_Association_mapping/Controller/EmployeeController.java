package com.SpringBoot_Association_mapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot_Association_mapping.Entity.Employee;
import com.SpringBoot_Association_mapping.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	// inserting data
	@PostMapping("/employee/insert")
	public String insertData(@RequestBody Employee emp) {
		return service.insertData(emp);
	}

	// retriving data
	@GetMapping("/employee")
	public List<Employee> getAllData() {
		return service.getAllData();
	}

	// retrive particular
	@GetMapping("/employee/{id}")
	public Employee getDataById(@PathVariable int id) {
		return service.getDataById(id);
	}

	// updating data
	@PutMapping("/employee/update/{id}")
	public String updateData(@RequestBody Employee emp, @PathVariable int id) {
		return service.updateData(emp, id);
	}

	// deleting data
	@DeleteMapping("/employee/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}
}