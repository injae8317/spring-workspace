package com.sample.di.demo3;

public class SampleDao {
	public void insert(String id, String password) {
		System.out.println(id + ", " + password + "�� ������");
	}
}
// SampleController�� SampleDaoŬ���� �����ϱ�
// Bean Configuration ���� �����ϱ�
// Bean Configuration ���Ͽ� ��ü ���� �� ���� �����ϱ�
// Demo3App �����ϱ�
// Demo3App���� springContainer �����ϰ�, ��ü ������ SampleController�� add() ���� �غ���
