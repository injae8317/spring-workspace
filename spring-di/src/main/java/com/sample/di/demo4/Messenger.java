package com.sample.di.demo4;

public interface Messenger {

	// 상황에 맞는 메신저란 객체를 사용하기위해
	// interface를 만든다.
   void sendMessage(String to, String text);
   String receiveMessage();
   
   
}