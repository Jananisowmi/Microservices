package com.janani.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OfferController {
	@RequestMapping("/")
	public void fetchOffer( int loanAmount) {
		ModelAndView model=new ModelAndView();
		ApplyLoan a=new ApplyLoan();
		int loan=a.getLoanAmount();
		model.addObject("loanAmount",loan);
		model.setViewName("MortgageOffer");
		
		
	}
	
	

}

