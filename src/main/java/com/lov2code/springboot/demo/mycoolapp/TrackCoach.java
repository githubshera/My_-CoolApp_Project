package com.lov2code.springboot.demo.mycoolapp;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "run hard 5k!";
	}

}
