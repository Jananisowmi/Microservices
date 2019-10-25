package com.janani.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployController {
	
	@Autowired
	EmployRepository dao;
	
	int numRecords=4;
	int numOfPages;
	
	@RequestMapping("/")
	public ModelAndView getEmployees() {
		ModelAndView mv=new ModelAndView();
		List<Employ> employeeList=(List<Employ>)dao.findAll();
		numOfPages=employeeList.size()/numRecords+employeeList.size()%numRecords;
		mv.addObject("pages",numOfPages);
	    mv.addObject("employeeList",employeeList);
		mv.setViewName("home");
		return mv;
	}

	
	@RequestMapping("/displayjavaCricketer")
	public ModelAndView getjavaCricekters() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findByDeptAndDesig("Sports","Cricketer"));
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/displayjavaDeveloper")
	public ModelAndView getjavaDeveloper() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findByDeptAndDesig("java","Developer"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayjavaProgrammer")
	public ModelAndView getjavaProgrammer() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findByDeptAndDesig("dotnet","Programmer"));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaybasicabv10000")
	public ModelAndView getbasicmorthan10000() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao. findByDeptAndDesigAndBasic("java","Developer",10000));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displaybasicabv10000andname")
	public ModelAndView getbasicmorthan10000andname() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao. findByDeptName("java","Developer",10000,"J"));
		mv.setViewName("home");
		return mv;
	}


	@RequestMapping("/displayAllSortByDesig")
	public ModelAndView displayAllSortByDesig() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao. findAll(Sort.by("desig")));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAllSortByDesigDesc")
	public ModelAndView getAllSortByDesigDesc() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao. findAll(Sort.by("desig").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	
	@RequestMapping("/displayAllSortBysalaryandDeptDesc")
	public ModelAndView getAllSortBysalaryandDeptDesc() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao. findAll(Sort.by("dept","basic").descending()));
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayJavaProgrammerSortBySal")
	public ModelAndView getJavaProgrammerSortBySal() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("employeeList",dao.findByDeptAndDesig("Java","Programmer","basic"));
		mv.setViewName("home");
		return mv;
	}

	
	@RequestMapping("/displayAll/Page/{pageno}")
	public ModelAndView displayAllSortByDesig(@PathVariable("pageno")int pageno) {
		ModelAndView mv=new ModelAndView();
		Page<Employ> pages=dao.findAll(PageRequest.of(pageno, numRecords));
		mv.addObject("pages",numOfPages);
		mv.addObject("employeeList",(pages).getContent());
		mv.setViewName("home");
		return mv;
	}
	

	
}
