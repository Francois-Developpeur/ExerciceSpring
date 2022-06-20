package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	private String[] data = {
			"phrase 1",
			"phrase 2",
			"phrase 3"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
