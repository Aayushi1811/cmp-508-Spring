package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	//private static AbstractApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	Department d1 = (Department)context.getBean("d1");
	System.out.println(d1);
	context.registerShutdownHook();

	System.out.println("----------------------------------------------------------------------------");
	Emp e1= (Emp)context.getBean("e1");
	System.out.println(e1);
	
	System.out.println("-------------------------------------------------------------------");
	Example ex1 = (Example)context.getBean("ex1");
	System.out.println(ex1);
	
	}
	

}
