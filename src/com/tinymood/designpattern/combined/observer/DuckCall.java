package com.tinymood.designpattern.combined.observer;

public class DuckCall implements Quackable {
	ObservableHelper observableHelper;
	
	public DuckCall() {
		this.observableHelper = new ObservableHelper(this);
	}
	
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observableHelper.registerObserver(observer);
	}

	public void notifyObservers() {
		observableHelper.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
