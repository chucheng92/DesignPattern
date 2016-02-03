package com.tinymood.designpattern.command.simpleremote;

/*
 * 遥控器是调用者
 */
public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
