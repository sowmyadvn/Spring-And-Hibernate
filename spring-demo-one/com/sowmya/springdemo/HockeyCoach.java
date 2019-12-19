package com.sowmya.springdemo;

public class HockeyCoach implements Coach {


	private FortuneService fortuneService;
	
	public HockeyCoach() {
		
	}
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Hockey: 1 hour of stick practice";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	
}
