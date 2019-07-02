package com.sample.di.demo4;

public class EventNoticeService {
	
	// 상황에 맞는 메신저란 객체를 사용하기위해
	// interface를 등록한다.
	private Messenger messenger;
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void notice(String event) {
		System.out.println("이벤트 공지 보내기");
		messenger.sendMessage("010-1111-1111", event);
	}
}
