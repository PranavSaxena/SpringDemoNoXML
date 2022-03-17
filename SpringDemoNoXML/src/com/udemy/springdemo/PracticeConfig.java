package com.udemy.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.udemy.springdemo")
public class PracticeConfig {

	@Bean
	public FortuneService practiceFortuneService() {
		return new PracticeFortuneService();
	}
	
	@Bean
	public Coach practiceCoach() {
		return new PracticeCoach(practiceFortuneService());
	}
}
