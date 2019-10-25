package com.janani.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	public User getUserByUsername(String username) {
		User user=userRepository.getUserByUsername(username);
		return user;
	}
		
	}
		
	

	

