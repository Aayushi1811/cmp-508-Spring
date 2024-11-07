package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
  

	private static ApplicationContext c;

	public static void main( String[] args )
    {
       c = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	
    	EmpDao cd=c.getBean("EmpDao",EmpDao.class);
   // Employee	c1 = new Employee();
  
	   // c1.setEid(213);
		//c1.setEname("Aayushi");
		//int c=cd.update(c1);
		//System.out.println("Record updated"+  c);
		
		//c1.setEid(213);
    	//int c=cd.delete(c1);
		//System.out.println("Record deleted"+  c);
		
		Employee ee=cd.getEmployee(213);                                                                                                                                                                                                                                
		System.out.println(ee);
		
		//List<Employee> employees= EmpDao.getAllEmp();
		//for(Employee c2:employees)
		//{
			//System.out.println(c2);
		//}
	}
}
