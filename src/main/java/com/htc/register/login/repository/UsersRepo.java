package com.htc.register.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.register.login.entity.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users,String> {

	public Users findByUsersEmail(String userEmail);
    
}
