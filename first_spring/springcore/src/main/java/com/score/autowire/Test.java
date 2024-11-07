package com.score.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;
	//private static AbstractApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	context = new ClassPathXmlApplicationContext("com/score/autowire/config.xml");
	Question q1= (Question)context.getBean("q1");
	System.out.println(q1);
	
	}

}
