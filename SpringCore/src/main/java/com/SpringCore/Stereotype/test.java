package com.SpringCore.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/Stereotype/StereotypeConfig.xml");
		student Student=context.getBean("ob", student.class);
		System.out.println(Student);
		System.out.println(Student.getAddress());
		student Student2=context.getBean("ob",student.class);
		System.out.println(Student.hashCode());
		System.out.println(Student2.hashCode());
		
		Teacher teacher= (Teacher) context.getBean("teacher");
		Teacher teacher2= (Teacher) context.getBean("teacher");
		System.out.println(teacher.hashCode());
		System.out.println(teacher2.hashCode());
		

		
	}

}
