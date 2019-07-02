package com.sample.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.view.CustomExcelView;

@Controller
public class HomeController {

	@RequestMapping("/home.do")
	public String home() {
		return "home";
	}
	//mvc-context�� �����Ѵ�� return���� String �϶� viewResolver �� �������
	// �����ϴ� ���� �̸����� ������ ã�ư���.
	
	@RequestMapping("/about.do")
	public ModelAndView about() {
		// ���� �𵨾غ並 ���� �ȴ�.
		ModelAndView mav = new ModelAndView();
		mav.setViewName("about");
		return mav;
	}
	// ModelAndView�� return�� �Ұ�� view�� �������Ƿ� viewResolver�� ��ġ���ʰ�
	// �ٷ� view�� ������ �ȴ�.
	
	@RequestMapping("/history.do")
	public void history() {
	}
	
	@RequestMapping("/excel.do")
	public ModelAndView xls() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("����", "2019�� ��ݱ� ������Ȳ");
		mav.addObject("����", 100000000);
		mav.addObject("����", 100000000);
		mav.addObject("��������", 70000000);
		mav.setView(new CustomExcelView());
		
		return mav;
	}
	
	@RequestMapping("/web.do")
	public ModelAndView web() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "2019�� ��ݱ� ������Ȳ");
		mav.addObject("buy", 100000000);
		mav.addObject("sell", 100000000);
		mav.addObject("profit", 70000000);
		mav.setViewName("web");
		return mav;
	}
}
