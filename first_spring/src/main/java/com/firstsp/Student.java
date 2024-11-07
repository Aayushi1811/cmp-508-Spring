package com.firstsp;

public class Student {
	private int sid;

	@Override
	public String toString() {
		return "Student [sid=" + sid + "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public Student() {
		// TODO Auto-generated constructor stub
		
		
	}

	public Student(int sid) {
		super();
		this.sid = sid;
	}

}
