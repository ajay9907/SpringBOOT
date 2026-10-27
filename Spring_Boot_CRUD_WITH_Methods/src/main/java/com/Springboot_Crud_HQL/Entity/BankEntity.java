package com.Springboot_Crud_HQL.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bank")
public class BankEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bId;
	@Column(name = "b_Name", nullable = false, length = 50)
	private String bName;

	private String city;

	public BankEntity() {
		super();

	}

	public BankEntity(String bName, String city) {
		super();
		this.bName = bName;
		this.city = city;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "BankEntity [bId=" + bId + ", bName=" + bName + ", city=" + city + "]";
	}

}
