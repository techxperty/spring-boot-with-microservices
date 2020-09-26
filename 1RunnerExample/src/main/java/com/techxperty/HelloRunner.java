package com.techxperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloRunner implements CommandLineRunner{
	
	@Autowired
	private UserSaveService service;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Hello Spring: This is Tech Xperty");
		String result = service.saveUser();
		System.out.println(result);
	}

}
