package com.spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	
	@Value("${name}")
	String name;
	@Value("${email}")
	String email;
	
	
	//Constructor Injection using autowiring
	public CricketCoach(FortuneService fortuneService) {
		System.out.println("Constructor injection using Construcctor calling via Java Config");
		this.fortuneService = fortuneService;
	}
	
//	//Setter Injection using autowiring
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Setter injection using autowiring");
//		this.fortuneService = fortuneService;
//	}
	
	//Getters setters to print name and email

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void getTraining() {
		System.out.println("Practice Batting");
	}

	public CricketCoach() {
	}
	
	public void getFortune()
	{
		System.out.println("Using DI");
		fortuneService.getFortune();
	}

}
