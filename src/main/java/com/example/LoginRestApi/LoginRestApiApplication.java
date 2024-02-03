package com.example.LoginRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LoginRestApiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LoginRestApiApplication.class, args);
	
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		System.out.println("encoded password : " + passwordEncoder.encode("admin"));
	}

}
