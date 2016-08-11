package com.tinymood.designpattern.combined.observer;

public class RedheadDuck implements Quackable {
	ObservableHelper observableHelper;
	
	public RedheadDuck() {
		this.observableHelper = new ObservableHelper(this);
	}
	
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observableHelper.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observableHelper.notifyObservers();
	}
	
	public String toString() {
		return "Redhead Duck";
	}
}
