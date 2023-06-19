package com.spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:details.properties")
public class javaConfigClass {
	
	@Bean
	public FortuneService happyFortuneService()
	{
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach cricketCoach()
	{
		CricketCoach cricketCoach=new CricketCoach(happyFortuneService());
		return cricketCoach;
	}

}
