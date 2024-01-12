package com.poc.sonstructorarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/poc/sonstructorarg/config.xml");
		CricketTeam bean = context.getBean("team",CricketTeam.class);
		System.out.println(bean.getInstruction());
	}

}
