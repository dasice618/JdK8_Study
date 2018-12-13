package com.dasice.design.mode.adaptor;

import org.junit.Test;

/**
 * 
 *@ClassName InterfaceAdaptorTest.java
 *@Description  接口的适配器模式测试类
 *@author 618
 *@date 2018年12月10日
 *
 */
public class InterfaceAdaptorTest {
	@Test
	public void testMain() {
		SourceWrp1 sourceWrp1 = new SourceWrp1();
		SourceWrp2 sourceWrp2 = new SourceWrp2();
		sourceWrp1.method1();
		sourceWrp1.method2();
		sourceWrp2.method1();
		sourceWrp2.method2();
	}
}
