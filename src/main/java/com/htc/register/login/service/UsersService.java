package com.htc.register.login.service;

import org.springframework.stereotype.Service;

import com.htc.register.login.entity.Users;

@Service
public interface UsersService {

	public String addUser(Users users) ;
	
	public Users getUserByEmail(String email);
}
