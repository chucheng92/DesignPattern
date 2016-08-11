package com.tinymood.designpattern.command.remote;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}

	@Override
	public void undo() {
		garageDoor.up();
	}
	
}
