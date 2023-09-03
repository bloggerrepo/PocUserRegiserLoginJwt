package com.htc.register.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.register.login.entity.Users;
import com.htc.register.login.service.UsersService;

@RestController()
@RequestMapping("/register")
public class RegisterController {

	
	@Autowired
	private UsersService usersService;

	@PostMapping(path = "/", consumes = "application/json")
	public String addUser(@RequestBody Users users) {
		
		try {
		usersService.addUser(users);
		return "User save ";
		}
		catch(Exception e) {
			return "user already exsist";
		}
	}
}
