package com.dasice.design.mode.factory;
/**
 * 
 *@ClassName TestMain.java
 *@Description  测试主方法
 *@author 618
 *@date 2018年12月10日
 *
 */
public class TestMain {

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.sendMessage();
	}

}
