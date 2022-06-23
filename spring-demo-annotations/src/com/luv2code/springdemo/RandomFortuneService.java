package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

//	create an array 

		private String[] ouais= {
				"If you are a virgo, your next 6 months would be like hell",
				"If you are a libra, you are good to go",
				"If you are a Scorpio, you are worthless"
		};
	
	//create a random number generator
		
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index =  myRandom.nextInt(ouais.length);
		
		String theFortune = ouais[index];
		
		return theFortune;
	}

}
