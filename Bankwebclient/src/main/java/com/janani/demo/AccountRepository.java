package com.janani.demo;


public interface AccountRepository {
	
	public Account ByUserid(int userid);
	
	public Account ByAccountnum(int accountnum);
	
	public String addAccount(Account account);
	
	public String deleteAccount(int accountnum);
	
	
	

	

}
