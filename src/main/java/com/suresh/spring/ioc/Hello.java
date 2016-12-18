package com.suresh.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		HelloIoc service = (HelloIoc) context
				.getBean("helloWorldService");
		String message = service.sayHello();
		System.out.println(message);
		System.out.println("Suresh");
 
		//set a new name
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
	}
}
