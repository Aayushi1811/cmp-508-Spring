package com.score;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    

	private static ApplicationContext c1;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        c1 = new ClassPathXmlApplicationContext("config1.xml");
       Student ss1=(Student) c1.getBean("s1");
       System.out.println(ss1);
    }
}
