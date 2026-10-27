package com.SpringBoot_Association_mapping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dept {
	@Id
	private int deptid;
	private String name;

	public Dept() {
		super();
	}

	public Dept(int deptid, String name) {
		super();
		this.deptid = deptid;
		this.name = name;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", name=" + name + "]";
	}

}
