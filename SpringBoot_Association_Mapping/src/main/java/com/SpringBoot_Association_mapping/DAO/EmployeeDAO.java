package com.SpringBoot_Association_mapping.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoot_Association_mapping.Entity.Dept;
import com.SpringBoot_Association_mapping.Entity.Employee;

@Repository
public class EmployeeDAO {
	@Autowired
	SessionFactory factory;

	public String insertData(Dept dept) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		s.persist(dept);

		tr.commit();
		s.close();

		return "Inserting Data into Employee...!";
	}

	public String updateData(Dept dpt, int id) {

		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		Dept d = ss.get(Dept.class, id);

		d.setDeptid(dpt.getDeptid());
		d.setName(dpt.getName());

		ss.merge(d);
		
		tr.commit();
		ss.close();

		return "Data Updated Successfully...!";
	}
}
