
package com.SpringBoot15CRUD.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private int age;

	private String gender = "Not Specified";

	@Column(nullable = false)
	private double salary;

	@Column(nullable = false)
	private String department;

	private String designation;

	private String phone;

	private String city = "Pune";

	private String state;

	@Column(nullable = false)
	private LocalDate joiningDate;

	private int experience = 0;

	private boolean active = true;

	private String address;

	private float bonus = 0.0f;

	private boolean married = false;

	private short totalLeaves = 12;

	private String employeeCode;

	private char shift = 'D';

	public Employee() {
		super();
	}

	public Employee(Long id, String name, String email, int age, String gender, double salary, String department,
			String designation, String phone, String city, String state, LocalDate joiningDate, int experience,
			boolean active, String address, float bonus, boolean married, short totalLeaves, String employeeCode,
			char shift) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.joiningDate = joiningDate;
		this.experience = experience;
		this.active = active;
		this.address = address;
		this.bonus = bonus;
		this.married = married;
		this.totalLeaves = totalLeaves;
		this.employeeCode = employeeCode;
		this.shift = shift;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public short getTotalLeaves() {
		return totalLeaves;
	}

	public void setTotalLeaves(short totalLeaves) {
		this.totalLeaves = totalLeaves;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public char getShift() {
		return shift;
	}

	public void setShift(char shift) {
		this.shift = shift;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + ", department=" + department + ", designation=" + designation + ", phone="
				+ phone + ", city=" + city + ", state=" + state + ", joiningDate=" + joiningDate + ", experience="
				+ experience + ", active=" + active + ", address=" + address + ", bonus=" + bonus + ", married="
				+ married + ", totalLeaves=" + totalLeaves + ", employeeCode=" + employeeCode + ", shift=" + shift
				+ "]";
	}

}
