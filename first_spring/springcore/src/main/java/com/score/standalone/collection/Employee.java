package com.score.standalone.collection;

import java.util.List;

public class Employee {
	
	private List<String> ename;

	public List<String> getEname() {
		return ename;
	}

	public void setEname(List<String> ename) {
		this.ename = ename;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> ename) {
		super();
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + "]";
	}



}
