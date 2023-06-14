package com.mycompany.study.ch08.first;

public class ExTelevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnOn();
		remoteControl.setMute(false);
		remoteControl.setMute(true);
		remoteControl.setVolume(10);
		remoteControl.setVolume(12);
		remoteControl.turnOff();
		
	}

}
