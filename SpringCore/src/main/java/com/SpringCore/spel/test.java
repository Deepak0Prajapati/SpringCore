package com.SpringCore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/spel/StereoTypeConfig.xml");
		demo d1=(demo) context.getBean("Demo");
		System.out.println(d1);
		SpelExpressionParser spel=new SpelExpressionParser();
		org.springframework.expression.Expression expression=spel.parseExpression("22+55");
		System.out.println(expression.getValue());

	}

}
