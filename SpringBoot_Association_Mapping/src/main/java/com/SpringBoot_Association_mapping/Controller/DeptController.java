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

import com.SpringBoot_Association_mapping.Entity.Dept;
import com.SpringBoot_Association_mapping.Service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;

	// Using inserting purpose
	@PostMapping("/dept/insert")
	public String insertData(@RequestBody Dept dept) {
		return service.insertData(dept);
	}

	// Using Retrive Data
	@GetMapping("/dept")
	public List<Dept> getAllData() {
		return service.getAllData();
	}

	// Retrive particular data through id
	@GetMapping("/dept/{id}")
	public Dept getDataById(@PathVariable int id) {
		return service.getDataById(id);
	}

	// Updating data
	@PutMapping("/dept/update/{id}")
	public String updateData(@RequestBody Dept dept, @PathVariable int id) {
		return service.updateData(dept, id);
	}

	// Deleting data
	@DeleteMapping("/dept/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return service.deleteData(id);
	}
}