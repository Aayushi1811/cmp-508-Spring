package com.score.stereotpye;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("com/score/stereotpye/config.xml");
		Student s1= context.getBean("student", Student.class);
		System.out.println(s1);
		
		System.out.println(s1.hashCode());
		Student s2=context.getBean("student",Student.class);
		System.out.println(s2.hashCode());
	}

}
