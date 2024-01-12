package com.SpringCore.autoWire.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/autoWire/Annotations/autoconfig.xml");
		Employee employee=(Employee) context.getBean("employee");
		System.out.println(employee);
		// TODO Auto-generated method stub

	}

}
