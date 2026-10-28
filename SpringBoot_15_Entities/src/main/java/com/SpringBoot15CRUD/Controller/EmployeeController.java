
package com.SpringBoot15CRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SpringBoot15CRUD.Entity.Employee;
import com.SpringBoot15CRUD.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/insert")
	public Employee insertEmployee(@RequestBody Employee employee) {
		return service.insertEmployee(employee);
	}

	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return service.getEmployeeById(id);
	}

	// UPDATE
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		return service.updateEmployee(id, employee);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		return "Employee deleted successfully";
	}
}
