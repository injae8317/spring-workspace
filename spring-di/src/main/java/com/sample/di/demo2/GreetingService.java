package com.sample.di.demo2;

public class GreetingService {

	// 1. ���� �޼ҵ带 ������ �����.
	private KoreanGreeting ko;
	private EnglishGreeting eng;
	// 2. ������ setter�޼ҵ带 ������ش�.
	public void setKo(KoreanGreeting ko) {
		this.ko = ko;
	}
	
	public void setEng(EnglishGreeting eng) {
		this.eng = eng;
	}
	
	public String hello(String name) {
		String message = ko.messge(name);
		
		return message;
	}
	
	public String bye() {
		String message = eng.goodbye();
		return message;
	}
}
