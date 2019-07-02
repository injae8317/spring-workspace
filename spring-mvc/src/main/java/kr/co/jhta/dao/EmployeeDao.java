package kr.co.jhta.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jhta.vo.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	private SqlMapClientTemplate template;
	
	public void addEmp (Employee emp) {
		template.insert("addEmp", emp);
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmp() {
		return template.queryForList("getAllEmp");
	}
	
	public Employee getEmpId(int empId) {
		return (Employee) template.queryForObject("getEmpId", empId);
	}
	
	public Employee getEmployeesByDepartmentId(int empId ) {
		return (Employee) template.queryForObject("getEmployeesByDepartmentId", empId);
	}
}
