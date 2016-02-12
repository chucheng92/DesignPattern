package com.tinymood.designpattern.combined.observer;

public class GooseAdapter implements Quackable {
	Goose goose;
	ObservableHelper observableHelper;
	
	public GooseAdapter() {
		this.observableHelper = new ObservableHelper(this);
	}
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
		this.observableHelper = new ObservableHelper(this);
	}
	
	@Override
	public void quack() {
		goose.honk();
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
		return "Goose pretending to be a Duck";
	}
}
