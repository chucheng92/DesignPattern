package com.tinymood.designpattern.combined.composite;

public class QuackCounter implements Quackable {
	Quackable duck;
	private static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int getQuacks() {
		return numberOfQuacks;
	}

}
