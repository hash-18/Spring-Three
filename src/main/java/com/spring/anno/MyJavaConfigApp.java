package com.spring.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyJavaConfigApp {

	public static void main(String[] args) {
		//Initialising spring container
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(javaConfigClass.class);
		//Retreiving beans from Container
	//	Coach theCoach=context.getBean("cricketCoach",Coach.class);
		
		//Using CricketCoach instead of Coach to be able to use two fileds i.e name and email which are defined only in CricketCoach and not in coach)
		CricketCoach theCoach=context.getBean("cricketCoach",CricketCoach.class);
		//Calling methods using beans
		theCoach.getTraining();
		theCoach.getFortune();
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());
		//Closing the context
		context.close();
	}

}
