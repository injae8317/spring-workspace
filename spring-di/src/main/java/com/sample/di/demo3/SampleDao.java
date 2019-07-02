package com.sample.di.demo3;

public class SampleDao {
	public void insert(String id, String password) {
		System.out.println(id + ", " + password + "를 저장함");
	}
}
// SampleController과 SampleDao클래스 구현하기
// Bean Configuration 파일 생성하기
// Bean Configuration 파일에 객체 생성 및 조립 설정하기
// Demo3App 정의하기
// Demo3App에서 springContainer 생성하고, 객체 꺼내서 SampleController의 add() 실행 해보기
