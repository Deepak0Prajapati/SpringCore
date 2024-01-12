package com.SpringCore.StandAlone.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/StandAlone/Collection/aloneconfig.xml");
		person p1= (person) context.getBean("person1");
		System.out.println(p1);
	}

}
