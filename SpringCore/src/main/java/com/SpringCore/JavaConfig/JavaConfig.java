package com.SpringCore.JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Samosa getsamosa() {
		
		return new Samosa();
	}
	
	@Bean
	public Student getstudent() {
		Student student =new Student(getsamosa());
		return student;
	}
	
	

}
