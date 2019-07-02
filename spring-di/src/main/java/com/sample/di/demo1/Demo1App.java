package com.sample.di.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1App {
	
	public static void main(String[] args) {
		
		// 객체를 등록한 xml파일 (주문서) 경로를 입력한다.
 		String resource = "classpath:/com/sample/di/demo1/demo1.xml";
		
 		// 경로를 이용하여 스프링 컨테이너를 만든다.
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		Sample1 sample1 = (Sample1) ctx.getBean("s1");	// 등록한 s1을 만든다.
		Sample2 sample2 = ctx.getBean("s2", Sample2.class);	// 등록한 s2를 만든다.
		
		String msg1 = sample1.hello();
		String msg2 = sample1.bye();
		String msg3 = sample2.greeting("홍길동");
		
		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println(msg3);
	}
}
