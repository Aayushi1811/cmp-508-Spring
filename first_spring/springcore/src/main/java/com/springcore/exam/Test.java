package com.springcore.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.exam.Question1;

public class Test {
	private static ApplicationContext context;
	
	public static void main(String[] args) {
			context = new ClassPathXmlApplicationContext("com/springcore/exam/config.xml");
			Question1 p1=(Question1)context.getBean("q1");
			System.out.println(p1.getQuestion());
			System.out.println(p1.getAnswer());

	}

}
