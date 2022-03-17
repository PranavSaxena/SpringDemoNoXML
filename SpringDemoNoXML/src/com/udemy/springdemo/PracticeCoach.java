package com.udemy.springdemo;

public class PracticeCoach implements Coach {

	private FortuneService fortuneService;
	
	public PracticeCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 3hr";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
