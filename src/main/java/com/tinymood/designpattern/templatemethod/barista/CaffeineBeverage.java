package com.tinymood.designpattern.templatemethod.barista;

public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
