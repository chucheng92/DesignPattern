package com.tinymood.designpattern.combined.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList<Quackable> ducks = new ArrayList<>();
		
	public void add(Quackable duck) {
		ducks.add(duck);
	}
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = iterator.next();
			duck.registerObserver(observer);
		}
		
	}

	@Override
	public void notifyObservers() {
	}
	
	public String toString() {
		return "Flock of Quackers";
	}
}
