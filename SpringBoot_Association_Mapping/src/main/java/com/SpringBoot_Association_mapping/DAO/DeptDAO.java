package com.SpringBoot_Association_mapping.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoot_Association_mapping.Entity.Dept;

@Repository
public class DeptDAO {

	@Autowired
	private SessionFactory factory;

 	public String insertData(Dept dept) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		s.persist(dept);

		tr.commit();
		s.close();

		return "Department Inserted Successfully!";
	}

	// READ ALL
	public List<Dept> getAllData() {
		Session s = factory.openSession();

		List<Dept> list = s.createSelectionQuery("from Dept", Dept.class).getResultList();

		s.close();
		return list;
	}

 	public Dept getDataById(int id) {
		Session s = factory.openSession();

		Dept dept = s.get(Dept.class, id);

		s.close();
		return dept;
	}

 	public String updateData(Dept dept, int id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Dept d = s.get(Dept.class, id);
		d.setName(dept.getName());

		tr.commit();
		s.close();

		return "Department Updated Successfully!";
	}

 	public String deleteData(int id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Dept dept = s.get(Dept.class, id);
		s.remove(dept);

		tr.commit();
		s.close();

		return "Department Deleted Successfully!";
	}
}