package com.lov2code.springboot.demo.mycoolapp.rest.copy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunrestController {

	// expose / that return "hello world" .
	@GetMapping("/")
	public String sayhello() {

		return "hello world this is my first spring demo project ";
		// http://localhost:8080
	}

	@GetMapping("/workout")
	public String getDailyWorkout() {

		return "run 5km daily ";
		// http://localhost:8080
	}

	@GetMapping("/market/out")
	public String getMarketgrowcery() {

		return "d-mart shopping";
		// http://localhost:8080
	}

}
