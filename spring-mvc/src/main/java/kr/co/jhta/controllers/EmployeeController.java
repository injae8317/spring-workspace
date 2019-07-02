package kr.co.jhta.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.form.EmployeeForm;
import kr.co.jhta.vo.Department;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	private DepartmentDao departmentDao; 
	
	public String depts() {
		departmentDao.getAllDep();
		return "";
	}
}
