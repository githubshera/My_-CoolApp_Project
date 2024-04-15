package com.lov2code.springboot.demo.mycoolapp;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "speed 30 per day";
	}

}
