package com.dasice.design.mode.factory;

public class SenderFactory {
	public Sender produce(String type) {
		if("mail".equals(type)) {
			return new MailSender();
		}else if("phone".equals(type.trim().toLowerCase())) {
			return new PhoneSender();
		}else {
			System.out.println("输入类型错误！");
			return null;
		}
	}
}
