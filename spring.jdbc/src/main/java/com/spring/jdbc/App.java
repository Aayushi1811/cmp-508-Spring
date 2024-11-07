package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext c=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate t=c.getBean("jdbcTemplate",JdbcTemplate.class);
        String q="insert into emp_data(eid,ename,salary)values(213,'aayushi',10000)";
        int result=t.update(q);
        System.out.println("record inserted"+result);
    }
}
