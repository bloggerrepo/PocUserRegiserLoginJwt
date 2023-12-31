package com.htc.register.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class Users {
	
	@Id
	private String usersEmail;
	private String password;
	private String fristName;
	private String lastName;
	private String role;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String usersEmail, String password, String fristName, String lastName, String role) {
		super();
		this.usersEmail = usersEmail;
		this.password = password;
		this.fristName = fristName;
		this.lastName = lastName;
		this.role = role;
	}

	public String getUsersEmail() {
		return usersEmail;
	}

	public void setUsersEmail(String usersEmail) {
		this.usersEmail = usersEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [usersEmail=" + usersEmail + ", password=" + password + ", fristName=" + fristName + ", lastName="
				+ lastName + ", role=" + role + "]";
	}
	
	
	

}
