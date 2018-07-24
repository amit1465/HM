package com.springs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springs.beans.Juggler;

public class BeansTest {
	public static void main(String arg[]){
		ApplicationContext factory = new ClassPathXmlApplicationContext("configuration.xml");
		Juggler duke = factory.getBean("duke", Juggler.class);
		duke.perform();
	}

}
