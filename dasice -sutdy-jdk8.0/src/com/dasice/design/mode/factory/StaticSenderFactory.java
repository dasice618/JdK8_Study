package com.dasice.design.mode.factory;
/**
 * 
 *@ClassName StaticSenderFactory.java
 *@Description  静态工厂模式（最常用的简单工厂模式）
 *@author 618
 *@date 2018年12月10日
 *
 */
public class StaticSenderFactory {
	
	public static Sender produceMailSender() {
		return new MailSender();
	}
	
	public static Sender producePhoneSender() {
		return new PhoneSender();
	}
}
