package com.tinymood.designpattern.combined.observer;

public class RubberDuck implements Quackable {
	ObservableHelper observableHelper;
	
	public RubberDuck() {
		this.observableHelper = new ObservableHelper(this);
	}
	
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observableHelper.registerObserver(observer);
	}

	public void notifyObservers() {
		observableHelper.notifyObservers();
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
