package com.score.config_class;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.score.config_class")
public class javaConfig {
	@Bean
	public Person getPerson()
	{
		Person p1=new Person();
		return p1;
	}

}
