package com.tinymood.designpattern.state.gumballstate;

public interface State {
 
	public abstract void insertQuarter();
	public abstract void ejectQuarter();
	public abstract void turnCrank();
	public abstract void dispense();
	
	public abstract void refill();
}
