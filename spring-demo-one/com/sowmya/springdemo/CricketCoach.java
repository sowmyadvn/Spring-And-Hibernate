package com.sowmya.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Century in 5 overs";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
