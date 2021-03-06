package com.sample.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
	
	// 11������ �������� list.do?pno=1 �ۼ�������� 13��° pno���̾����� pno�� 1�� �ش�.
	@RequestMapping("/list.do")
	public String list(@RequestParam(value= "pno", required = false, defaultValue = "1") int pno) {
		System.out.println("pno: " + pno);
		return "list";
	}
	
	@RequestMapping(value="/register.do", method = RequestMethod.GET)
	public String form() {
		return "registerform";
	}
	
	@RequestMapping(value="/register.do", method = RequestMethod.POST)
	public String register(String name, String id, String password, String email) {
		System.out.println("�̸�: " + name);
		System.out.println("���̵�: " + id);
		System.out.println("��й�ȣ: " + password);
		System.out.println("�̸���: " + email);
		
		return "redirect:list.do";
	}
}
