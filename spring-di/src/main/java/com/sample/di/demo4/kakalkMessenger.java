package com.sample.di.demo4;
// �������̽��� �������ϴ� Ŭ������ �����.
public class kakalkMessenger implements Messenger{

	// ������ 1
	public String receiveMessage() {
		System.out.println("ī������ �޽��� �����ϱ�");
		return "����: �ݰ����ϴ�.";
	}
	// ������ 2
	public void sendMessage(String to, String text) {
		System.out.println("ī������ �޼��� ������");
		System.out.println("�޴»�� : " + to);
		System.out.println("�޼��� ���� : " + text);
	}
}
