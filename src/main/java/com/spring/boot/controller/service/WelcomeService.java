package com.spring.boot.controller.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retreiveWelcomeMessage(){
		return "Hey Good Morning..!";
	}
}
