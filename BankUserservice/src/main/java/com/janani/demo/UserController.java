package com.janani.demo;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class UserController {
	protected Logger logger = Logger
			.getLogger(UserController.class.getName());
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/{username}/user")
	public User byusername(@PathVariable("username") String username) {
		logger.info("bankuserservice byusername() invoked: " + username);
		User user = userRepository.getUserByUsername(username);
		logger.info("bankuserservice byusername() found: " + user);
		return user;
	}

}
