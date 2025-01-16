package com.itg.examp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginSystemApplication {

	public static void main(String[] args) {
		System.out.println("시스템 정상 작동");
		SpringApplication.run(LoginSystemApplication.class, args);
	}

}

