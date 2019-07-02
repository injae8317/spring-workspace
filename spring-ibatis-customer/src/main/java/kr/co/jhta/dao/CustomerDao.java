package kr.co.jhta.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {

	public SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	// 전체출력
	public List<Customer> getAllCustomer() {
		return (List<Customer>) template.queryForList("getAllCustomer");
	}
	//상세 고객정보 출력
	
	// 고객정보 검색
	
	// 고객정보 변경
	public void upateCustomer (Customer customer) {
		template.update("upateCustomer",customer);
	}
	// 고객정보 삭제
}
