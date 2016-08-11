package com.tinymood.designpattern.combined.observer;

//主题（被观察者）
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
