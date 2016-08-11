package com.tinymood.designpattern.adapter.duck;

import java.util.Random;

public class DuckAdapter implements Turkey {
	Random rand;
	Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
	
	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		if (rand.nextInt(5)==0) {
			duck.fly();
		}
	}

}
