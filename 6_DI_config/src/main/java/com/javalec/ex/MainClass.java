package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml","classpath:applicationCTX1.xml");
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}
		
		Student student3 = ctx.getBean("student3",Student.class);
		student3 = studentInfo.getStudent();
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		}
	}
}
