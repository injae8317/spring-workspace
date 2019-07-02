package com.sample.di.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo5App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo5/demo5.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		UserService user = ctx.getBean("userService", UserService.class);
		
		user.addNewUser("������", "injae", "zxcv1234");
	}
}