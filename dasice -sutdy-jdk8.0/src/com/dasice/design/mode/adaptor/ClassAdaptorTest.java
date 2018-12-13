package com.dasice.design.mode.adaptor;

import org.junit.Test;
/**
 * 
 *@ClassName ClassAdaptorTest.java
 *@Description  类的适配器测试类
 *@author 618
 *@date 2018年12月10日
 *
 */
public class ClassAdaptorTest {

	@Test
	public void testMain() {
		Targetable a = new Adaptor();
		a.method1();
		a.method2();
	}
}
