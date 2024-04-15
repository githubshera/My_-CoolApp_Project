package com.lov2code.springboot.demo.mycoolapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice fast bowling for 15 min from now onwords!! ";
	}

}
