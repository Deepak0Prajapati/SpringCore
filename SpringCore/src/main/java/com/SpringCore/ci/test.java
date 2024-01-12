package com.SpringCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contect=new ClassPathXmlApplicationContext("com/SpringCore/ci/ciConfig.xml");
		Person person=(Person) contect.getBean("person");
//		Person person1=(Person) contect.getBean("person1");
		System.out.println(person);
//		System.out.println(person1);
		addition add=(addition) contect.getBean("add");
		add.doSum();
		

	}

}
