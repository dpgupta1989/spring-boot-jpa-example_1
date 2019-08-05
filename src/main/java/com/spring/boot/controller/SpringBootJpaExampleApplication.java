package com.spring.boot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.boot")
public class SpringBootJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaExampleApplication.class, args);
		System.out.println("Hi Dablu");
	}

}
