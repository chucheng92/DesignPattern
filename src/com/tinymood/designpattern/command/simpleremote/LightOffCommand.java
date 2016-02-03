package com.tinymood.designpattern.command.simpleremote;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	/*
	 * 调用接收对象的on方法
	 */
	@Override
	public void execute() {
		light.off();
	}

}
