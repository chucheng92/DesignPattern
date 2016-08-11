package com.tinymood.designpattern.combined.observer;

import java.util.ArrayList;
import java.util.Iterator;

// 主题的辅助类
public class ObservableHelper implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<>();
	QuackObservable duck;
	
	public ObservableHelper(QuackObservable duck) {
		this.duck = duck;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}

}
