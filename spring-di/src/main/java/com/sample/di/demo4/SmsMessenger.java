package com.sample.di.demo4;

public class SmsMessenger implements Messenger {
	// �������̽��� �������ϴ� Ŭ������ �����.
	
	// ������ 1
	public void sendMessage(String to, String text) {
		System.out.println("SMS �ܹ� �޼��� ������");
		System.out.println("�޴� ��� ��ȭ��ȣ:" + to);
		System.out.println("�޼��� ����:" + text);
	}
	
	// ������ 2
	public String receiveMessage() {
		System.out.println("SMS �ܹ� �޼��� �ޱ� ");
		return "�ȳ��ϼ���";
	}

}
