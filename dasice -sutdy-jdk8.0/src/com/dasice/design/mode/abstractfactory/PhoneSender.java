package com.dasice.design.mode.abstractfactory;

public class PhoneSender implements Sender {

	@Override
	public void sendMessage() {
		System.out.println("this is PhoneSender!");
	}

}
