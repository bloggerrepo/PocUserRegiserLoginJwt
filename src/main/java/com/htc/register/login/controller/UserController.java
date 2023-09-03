package com.htc.register.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.htc.register.login.entity.Users;
import com.htc.register.login.service.UsersService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UsersService usersService;

	
	@GetMapping("/login")
	public Users getUserDetails(@RequestParam String email) {
		System.out.println("user details...");
		return usersService.getUserByEmail(email);
	}

}
