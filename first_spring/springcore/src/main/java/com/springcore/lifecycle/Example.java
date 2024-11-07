package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String sub;

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [sub=" + sub + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("subject start");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("subject end");
	}

}
