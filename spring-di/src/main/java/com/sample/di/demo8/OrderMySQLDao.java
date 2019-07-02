package com.sample.di.demo8;

import org.springframework.stereotype.Repository;

// @Repository ("아이디") 
@Repository("orderMyQL")
public class OrderMySQLDao implements OrderDao {
	
	public void removeOrder() {
		System.out.println("MySQL에서 주문정보를 삭제합니다.");
	}
}
