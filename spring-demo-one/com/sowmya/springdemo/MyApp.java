package com.sowmya.springdemo;

public class MyApp {
	public static void main(String[] args) {
		//Check baseball workout
		Coach bbcoach = new BaseballCoach();
		System.out.println(bbcoach.getDailyWorkout());
		Coach hcoach = new HockeyCoach();
		System.out.println(hcoach.getDailyWorkout());
	}
}
