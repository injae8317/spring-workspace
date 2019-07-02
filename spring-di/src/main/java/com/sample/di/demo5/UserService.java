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
 * @ �������̽� �����ϱ� interface UserDao -> void insertUser(String name, String id,
 * String password) interface PointDao -> void updatePoint(String id, int
 * Point);
 * 
 * @ ����Ŭ���� ���� class UserDummyDao implements UserDao class PointDummyDao
 * implements PointDao
 * 
 * @ ����Ŭ���� ���� class UserService -> void addNewUser(String name, String id,
 * String password) { // �ű� ȸ�� ��� ��� // �ű� ȸ���� ����Ʈ�� 10���� �����ϴ� ��� } -UserService��
 * UserDao���� PointDao���� �ʿ��ϴ�.
 * 
 * @ Bean configuration ���� UserDao���� PointDao�� ��ü ���� UserService ��ü ���� �� ����
 * 
 * @ App Ŭ���� ���� Spring container�� �����ϰ�, UserService��ü�� �����ͼ� addNewUser()��� �����غ���
 */