package com.sample.di.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo4App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo4/demo4.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
	 EventNoticeService event = ctx.getBean("eventNoticeService", EventNoticeService.class);
	 OrderService order = ctx.getBean("orderService", OrderService.class);
	 
	 event.notice("홈페이지 오픈");
	 order.sendOrderStatus();
	}
}
