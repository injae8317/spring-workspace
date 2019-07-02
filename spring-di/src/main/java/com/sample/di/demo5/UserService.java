package com.sample.di.demo5;

public class UserService {

	private UserDao userDao;
	private PointDao pointDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setPointDao(PointDao pointDao) {
		this.pointDao = pointDao;
	}
	public void addNewUser(String name, String id, String password) {
		userDao.insertUser(name, id, password);
		pointDao.updatePoint(id, 10);
	}
}
/*
 * @ 인터페이스 정의하기 interface UserDao -> void insertUser(String name, String id,
 * String password) interface PointDao -> void updatePoint(String id, int
 * Point);
 * 
 * @ 구현클래스 정의 class UserDummyDao implements UserDao class PointDummyDao
 * implements PointDao
 * 
 * @ 구현클래스 정의 class UserService -> void addNewUser(String name, String id,
 * String password) { // 신규 회원 등록 기능 // 신규 회원의 포인트를 10으로 변경하는 기능 } -UserService는
 * UserDao류와 PointDao류가 필요하다.
 * 
 * @ Bean configuration 파일 UserDao류와 PointDao류 객체 생성 UserService 객체 생성 및 조립
 * 
 * @ App 클래스 정의 Spring container를 생성하고, UserService객체를 가져와서 addNewUser()기능 실행해보기
 */