package com.janani.demo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	protected Logger logger = Logger
			.getLogger(AccountController.class.getName());
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	AccountService accountservice;
	
	
	@RequestMapping("/{userid}/get")
	public Account byuserid(@PathVariable("userid") int userid) {
		Account account = accountRepository.findAccountByUserid(userid);
		return account;
}
	
	@RequestMapping("/add")
	public String addAcc(@RequestBody Account account) {
	accountRepository.save(account);
	return "account created";
	}
		
	@DeleteMapping("/{accountnum}/delete")
	public String deleteAccount(@PathVariable int accountnum) {
		accountRepository.deleteById(accountnum);
		return "account deleted";
	}
	
//	@RequestMapping("/getAll")
//	public List<Account> getAllAccounts() {
//		List<Account> acc = (List<Account>) accountRepository.findAll();
//		return acc;
//		 
		
	@RequestMapping("/{accountnum}/getaccountnum")
	public Account byaccountnum(@PathVariable("accountnum") int accountnum) {
		Account account = accountRepository.findAccountByAccountnum(accountnum);
		return account;
}
		
	}
		
		
	
		
		
	
	
	
	
	
	
	

