package com.janani.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;


public class RemoteAccountRepository  implements AccountRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteAccountRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}

	@Override
	public Account ByUserid(int userid) {
		
		return restTemplate.getForObject(serviceUrl+"/Accounts/{userid}/get",
				Account.class,userid);
	}

	@Override
	public Account ByAccountnum(int accountnum) {
		return restTemplate.getForObject(serviceUrl+"/Accounts/{accountnum}/getaccountnum",
				Account.class,accountnum);
	
	}

	@Override
	public String addAccount(Account account) {
		 restTemplate.getForObject(serviceUrl+"/Accounts/add",
				Account.class,account);
		 return "account added";
	}

	@Override
	public String deleteAccount(int accountnum) {
		 restTemplate.getForObject(serviceUrl+"/Accounts/{accountnum}/delete",
				Account.class,accountnum);
		return "account deleted";
		 
	}

}
