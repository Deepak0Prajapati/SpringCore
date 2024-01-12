package com.SpringCore.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/Lifecycle/config.xml");
//		samosa s=(samosa) context.getBean("s1");
//		System.out.println(s);
		context.registerShutdownHook();
//		
//		pepsi p=(pepsi) context.getBean("p1");
//		System.out.println(p);
		Example example=(Example) context.getBean("example");
		System.out.println(example);

	}

}
