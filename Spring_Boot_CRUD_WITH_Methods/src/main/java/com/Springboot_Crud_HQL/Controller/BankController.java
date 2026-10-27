package com.Springboot_Crud_HQL.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot_Crud_HQL.Entity.BankEntity;
import com.Springboot_Crud_HQL.Service.BankService;

@RestController
public class BankController {

	BankService service;

	public BankController(BankService service) {
		this.service = service;
	}

	@PostMapping("/insert/{id}")
	public String insertDATA(@RequestBody BankEntity bnk) {
		return service.insertDATA(bnk);
	}

	@PutMapping("/update/{id}")
	public String updateData(@RequestBody BankEntity be, @PathVariable int id) {

		String msg = service.updataData(be, id);

		return msg;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}

}