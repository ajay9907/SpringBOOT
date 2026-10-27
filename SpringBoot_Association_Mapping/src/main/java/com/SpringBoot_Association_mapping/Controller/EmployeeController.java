package com.SpringBoot_Association_mapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	EmployeeService service;

	@PostMapping("/employee/insert")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return msg;
	}

	@PutMapping("/employee/update/{id}")
	public String updateData(@RequestBody Employee emp, @PathVariable int id) {
		String msg = service.updateData(emp, id);
		return msg;

	}
}
