package com.tinymood.designpattern.command.remote;

public class TestRemoteControlWithUndo {
	public static void main(String[] args) {
		RemoteControlWithUndo remote = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		CeilingFan ceilingFan = new CeilingFan("Living room");
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		remote.setCommand(1, ceilingFanMedium, ceilingFanOff);
		remote.setCommand(2, ceilingFanHigh, ceilingFanOff);
		
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed(); 
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(0);
		System.out.println(remote);
		
		/*
		 * 测试吊扇
		 */
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		
		remote.onButtonWasPushed(2);
		System.out.println(remote);
		remote.undoButtonWasPushed();
	}
}
