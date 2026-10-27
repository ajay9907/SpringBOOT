package com.SpringBoot_Association_mapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	DeptService service;

	@PostMapping("/dept/insert")
	public String insertData(@RequestBody Dept dept) {
		String msg = service.insertData(dept);
		return msg;
	}

	@PutMapping("dept/update/{id}")
	public String updateData(@RequestBody Dept dept, @PathVariable int id) {
		String msg = service.updateData(dept, id);
		return msg;
	}

}
