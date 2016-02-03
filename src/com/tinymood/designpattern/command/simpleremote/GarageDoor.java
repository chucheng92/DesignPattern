package com.tinymood.designpattern.command.simpleremote;

public class GarageDoor {
	public void up() {
		System.out.println("Garage door is open.");
	}
	
	public void down() {
		System.out.println("Garage door is close.");
	}
	
	public void lightOn() {
		System.out.println("Garage light is on");
	}

	public void lightOff() {
		System.out.println("Garage light is off");
	}
}
