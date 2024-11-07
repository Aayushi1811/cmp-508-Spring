package com.score.el;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/score/el/config.xml");
		Demo s1= (Demo)context.getBean("demo");
		System.out.println(s1);
	
	}

}
