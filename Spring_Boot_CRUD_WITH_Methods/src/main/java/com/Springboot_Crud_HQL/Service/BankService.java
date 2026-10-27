
package com.Springboot_Crud_HQL.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot_Crud_HQL.DAO.BankDAO;
import com.Springboot_Crud_HQL.Entity.BankEntity;

@Service
public class BankService {

	BankDAO dao;

	@Autowired
	public BankService(BankDAO dao) {
		this.dao = dao;
	}

	public String insertDATA(BankEntity bnk) {
		return dao.insertDATA(bnk);
	}

	public String updataData(BankEntity be, int id) {
		String msg = dao.updateData(be, id);
		return msg;

	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}
}
