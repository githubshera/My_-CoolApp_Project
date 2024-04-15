package com.lov2code.springboot.demo.mycoolapp;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{

	@Override
	public String getDailyWorkOut() {
		return "practice your backhand volly";
	}

}
