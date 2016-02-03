package com.tinymood.designpattern.command.party;

public class TestPartyControl {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remote.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remote);
		System.out.println("--- Pushing Macro On---");
		remote.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		System.out.println("--- undo ---");
		remote.undoButtonWasPushed();
	}
}
