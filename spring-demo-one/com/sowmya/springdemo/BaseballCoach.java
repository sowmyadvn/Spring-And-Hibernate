package com.sowmya.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		
	}
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout()  {
		return "Baseball: 30 mins of batting practice";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
