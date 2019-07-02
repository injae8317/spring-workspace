package com.sample.di.demo2;

public class GreetingService {

	// 1. 담을 메소드를 변수로 만든다.
	private KoreanGreeting ko;
	private EnglishGreeting eng;
	// 2. 변수를 setter메소드를 만들어준다.
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
