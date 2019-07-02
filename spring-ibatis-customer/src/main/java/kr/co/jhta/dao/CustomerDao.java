package kr.co.jhta.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import kr.co.jhta.vo.Customer;

public class CustomerDao {

	public SqlMapClientTemplate template;
	public void setTemplate(SqlMapClientTemplate template) {
		this.template = template;
	}
	// ��ü���
	public List<Customer> getAllCustomer() {
		return (List<Customer>) template.queryForList("getAllCustomer");
	}
	//�� ������ ���
	
	// ������ �˻�
	
	// ������ ����
	public void upateCustomer (Customer customer) {
		template.update("upateCustomer",customer);
	}
	// ������ ����
}
