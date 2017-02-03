package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestRepoApplication {
	
	
	public void display() {
		System.out.println("Change 1");
 	}
	 

	public static void main(String[] args) {
		SpringApplication.run(TestRepoApplication.class, args);
	}
}
