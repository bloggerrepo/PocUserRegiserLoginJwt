package com.htc.register.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.htc.register.login.entity.Users;
import com.htc.register.login.repository.UsersRepo;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersRepo usersRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public String addUser(Users user) {

		if (usersRepo.findById(user.getUsersEmail()).isPresent()) {
			return "You cant use " + user.getUsersEmail() + "email";
		} else {
			user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
			user.setRole("ROLE_USER");
			usersRepo.save(user);
			return "user save ";

		}

	}

	@Override
	public Users getUserByEmail(String email) {
		// TODO Auto-generated method stub
		
		Users u =usersRepo.findByUsersEmail(email);
		return u;
	}
}
