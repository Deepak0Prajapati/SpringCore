package com.SpringCore.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/SpringCore/Ref/RefConfig.xml");
		A a=(A) context.getBean("Aref");
		System.out.println(a);
		System.out.println(a.getOb().getY());
		
		// TODO Auto-generated method stub

	}

}
