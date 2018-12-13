package com.dasice.design.mode.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}
	
	public void producePhoneSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new PhoneSender());
		}
	}
}
