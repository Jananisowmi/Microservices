package com.janani;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class EmployController {
	
	@Autowired
	EmployDAO dao;
	
	@RequestMapping("/")
	public ModelAndView getEmployees() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findAll());
		mv.setViewName("home");
		return mv;
	}

}
