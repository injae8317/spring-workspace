package com.sample.di.demo4;

public interface Messenger {

	// ��Ȳ�� �´� �޽����� ��ü�� ����ϱ�����
	// interface�� �����.
   void sendMessage(String to, String text);
   String receiveMessage();
   
   
}