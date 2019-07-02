package com.sample.di.demo4;

public class SmsMessenger implements Messenger {
	// 인터페이스를 재정의하는 클래스를 만든다.
	
	// 재정의 1
	public void sendMessage(String to, String text) {
		System.out.println("SMS 단문 메세지 보내기");
		System.out.println("받는 사람 전화번호:" + to);
		System.out.println("메세지 내용:" + text);
	}
	
	// 재정의 2
	public String receiveMessage() {
		System.out.println("SMS 단문 메세지 받기 ");
		return "안녕하세요";
	}

}
