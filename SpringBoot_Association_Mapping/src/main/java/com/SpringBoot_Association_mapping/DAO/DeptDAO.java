package com.SpringBoot_Association_mapping.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoot_Association_mapping.Entity.Employee;

@Repository
public class DeptDAO {
	@Autowired
	SessionFactory factory;

	public String insertData(Employee emp) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(emp);
		tr.commit();
		ss.close();
		return "It is an Inserting Values in Dept...!";

	}

	public String updateData(Employee emp, int id) {

		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Employee e = s.get(Employee.class, id);

		s.merge(e);
		tr.commit();
		s.close();

		return " Dept Data Update Successfully..!";

	}
}
