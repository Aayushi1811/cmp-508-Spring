package com.springcore.CI;

public class person {
	private int pid;
	private String pname;
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "person [pid=" + pid + ", pname=" + pname + "]";
	}

}
