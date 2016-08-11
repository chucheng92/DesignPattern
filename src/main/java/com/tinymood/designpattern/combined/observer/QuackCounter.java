package com.tinymood.designpattern.combined.observer;

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

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}

}
