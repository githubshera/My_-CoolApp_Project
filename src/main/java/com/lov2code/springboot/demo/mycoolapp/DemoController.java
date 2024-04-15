package com.lov2code.springboot.demo.mycoolapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	// create a constructor in your class for injection.
	// define the private field for the dependencies.
	@Autowired
	private Coach myCoach;

	// define the constructor for dependencies injection.
	@Autowired
	public void setCoach(Coach myCoach) {
		this.myCoach = myCoach;
	}

	@Autowired
	public DemoController(Coach theCoach) {
		myCoach = theCoach;
	}
//	
//	@Autowired
//	public DemoController(@Qualifier("baseBallCoach") theCoach) {  //" just use when multiple implementation are the then use specific one"
//		myCoach = theCoach;
//	}

	@GetMapping("/dailyWorkOut")
	public String getDailyWorkout() {

		return myCoach.getDailyWorkOut();
		// http://localhost:8080
	}
}
