package com.sowmya.springdemo;

public class MyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String fortune = "Today is your lucky day";
		return fortune;
	}

}
