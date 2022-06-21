package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "hit the ball 150times in a row";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
