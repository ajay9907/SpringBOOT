package com.SpringBoot_Association_mapping.DAO;

import java.util.List;

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
	private SessionFactory factory;

	public String insertData(Employee emp) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Dept dept = s.get(Dept.class, emp.getDept().getDeptid());

		emp.setDept(dept);
		s.persist(emp);

		tr.commit();
		s.close();

		return "Employee Inserted Successfully!";
	}

	// we need list because we retrive all data in array of object form
	public List<Employee> getAllData() {
		Session s = factory.openSession();

		List<Employee> list = s.createQuery("from Employee", Employee.class).getResultList();

		s.close();
		return list;
	}

	public Employee getDataById(int id) {
		Session s = factory.openSession();

		Employee emp = s.get(Employee.class, id);

		s.close();
		return emp;
	}

	public String updateData(Employee emp, int id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Employee e = s.get(Employee.class, id);

		e.setName(emp.getName());
		e.setAge(emp.getAge());

		Dept dept = s.get(Dept.class, emp.getDept().getDeptid());

		e.setDept(dept);

		tr.commit();
		s.close();

		return "Employee Updated Successfully!";
	}

	// DELETE
	public String deleteData(int id) {
		Session s = factory.openSession();
		Transaction tr = s.beginTransaction();

		Employee emp = s.get(Employee.class, id);
		s.remove(emp);

		tr.commit();
		s.close();

		return "Employee Deleted Successfully!";
	}
}