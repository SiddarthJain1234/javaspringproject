package com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Student s1=(Student) context.getBean("u1");
	System.out.println(s1);
	context.registerShutdownHook();

}
}
