package com.bhanu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhanu.spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new AnnotationConfigApplicationContext("com.bhanu.spring");
		Employee bean = ioc.getBean("employee", Employee.class);
		Employee bean1 = ioc.getBean("employee", Employee.class);
		Employee bean2 = ioc.getBean("employee", Employee.class);
		System.out.println(bean);
		System.out.println(bean1);
		System.out.println(bean2);
		

	}

}
