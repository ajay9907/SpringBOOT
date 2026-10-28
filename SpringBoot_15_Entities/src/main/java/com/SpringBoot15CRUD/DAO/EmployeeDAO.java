
package com.SpringBoot15CRUD.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBoot15CRUD.Entity.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	SessionFactory factory;

	public Employee insertEmployee(Employee employee) {
		Session session = factory.getCurrentSession();
		session.persist(employee);
		return employee;
	}

	public List<Employee> getAllEmployees() {
		Session session = factory.getCurrentSession();

		return session.createQuery("FROM Employee", Employee.class).getResultList();
	}

	public Employee getEmployeeById(Long id) {
		Session session = factory.getCurrentSession();

		return session.get(Employee.class, id);
	}

	public Employee updateEmployee(Long id, Employee employee) {
		Session session = factory.getCurrentSession();

		Employee existing = session.get(Employee.class, id);

		existing.setName(employee.getName());
		existing.setEmail(employee.getEmail());
		existing.setAge(employee.getAge());
		existing.setGender(employee.getGender());
		existing.setSalary(employee.getSalary());
		existing.setDepartment(employee.getDepartment());
		existing.setDesignation(employee.getDesignation());
		existing.setPhone(employee.getPhone());
		existing.setCity(employee.getCity());
		existing.setState(employee.getState());
		existing.setJoiningDate(employee.getJoiningDate());
		existing.setExperience(employee.getExperience());
		existing.setActive(employee.isActive());
		existing.setAddress(employee.getAddress());
		existing.setBonus(employee.getBonus());
		existing.setMarried(employee.isMarried());
		existing.setTotalLeaves(employee.getTotalLeaves());
		existing.setEmployeeCode(employee.getEmployeeCode());
		existing.setShift(employee.getShift());

		return existing;
	}

	public void deleteEmployee(Long id) {
		Session session = factory.getCurrentSession();

		Employee employee = session.getReference(Employee.class, id);
		session.remove(employee);
	}
}
