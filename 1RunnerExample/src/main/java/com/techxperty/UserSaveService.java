package com.techxperty;

import org.springframework.stereotype.Service;

@Service
public class UserSaveService {
	
	public String saveUser() {
		// DAO calling: User data insert
		return "Hello Spring Boot: This is Tech Xperty";
	}
}
