package com.dasice.design.mode.factory;

public class PhoneSender implements Sender {

	@Override
	public void sendMessage() {
		System.out.println("this is PhoneSender!");
	}

}
