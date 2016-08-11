package com.tinymood.designpattern.combined.decorator;

public class GooseAdapter implements Quackable {
	Goose goose;
	
	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		goose.honk();
	}

}
