package com.tinymood.designpattern.combined.observer;

public class Quacklogist implements Observer {
	
	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quacklogist: "+duck+" just quacked.");
	}
	
	public String toString() {
		return "Quackologist";
	}
}
