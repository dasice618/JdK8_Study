package com.dasice.design.mode.abstractfactory;

public class MailSenderFactory implements Provider {

	@Override
	public Sender produce() {
		
		return new MailSender();
	}

}
