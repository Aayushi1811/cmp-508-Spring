package com.score.config_class;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Person p= (Person)context.getBean("getPerson");
		System.out.println(p);
		p.pname();
	
}
}
