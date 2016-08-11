package com.tinymood.designpattern.combined.observer;

public class MallardDuck implements Quackable {
	ObservableHelper observableHelper;
	
	public MallardDuck() {
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
		return "Mallard Duck";
	}
}
