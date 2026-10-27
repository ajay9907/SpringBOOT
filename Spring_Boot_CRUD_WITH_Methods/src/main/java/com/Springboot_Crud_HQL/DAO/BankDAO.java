package com.Springboot_Crud_HQL.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Springboot_Crud_HQL.Entity.BankEntity;

@Repository
public class BankDAO {
	@Autowired
	SessionFactory factory;

	public String insertDATA(BankEntity bnk) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(bnk);

		tr.commit();
		ss.close();
		return " Inserted Data Submitted Successfully...!";
	}

	public String updateData(BankEntity b, int id) {

		Session s = factory.openSession();

		Transaction tr = s.beginTransaction();

		BankEntity bank = s.find(BankEntity.class, id);

		bank.setbName(b.getbName());
		bank.setCity(b.getCity());
		s.merge(bank);
		tr.commit();

		s.close();

		return "Employee Updated Successfully!";
	}

	public String deleteData(int id) {

		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		BankEntity bank = s.find(BankEntity.class, id);

		s.remove(bank);

		tr.commit();
		s.close();

		return "Deleted Data Successfully ...!";

	}

}
