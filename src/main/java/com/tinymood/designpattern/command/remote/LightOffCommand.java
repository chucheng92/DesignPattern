package com.tinymood.designpattern.command.remote;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	/*
	 * 调用接收对象的off方法
	 */
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
