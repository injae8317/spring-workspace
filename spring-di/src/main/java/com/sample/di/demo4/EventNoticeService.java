package com.sample.di.demo4;

public class EventNoticeService {
	
	// ��Ȳ�� �´� �޽����� ��ü�� ����ϱ�����
	// interface�� ����Ѵ�.
	private Messenger messenger;
	public void setMessenger(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void notice(String event) {
		System.out.println("�̺�Ʈ ���� ������");
		messenger.sendMessage("010-1111-1111", event);
	}
}