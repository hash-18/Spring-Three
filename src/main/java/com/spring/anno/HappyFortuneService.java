package com.spring.anno;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public void getFortune() {
		System.out.println("Happy Day");

	}

}
