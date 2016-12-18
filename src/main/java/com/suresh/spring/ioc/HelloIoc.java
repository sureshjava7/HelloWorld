package com.suresh.spring.ioc;

import org.springframework.stereotype.Service;


@Service("HelloIoc")
public class HelloIoc {
	
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}
}
