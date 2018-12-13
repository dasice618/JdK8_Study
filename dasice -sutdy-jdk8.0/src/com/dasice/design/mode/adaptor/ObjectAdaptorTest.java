package com.dasice.design.mode.adaptor;

import org.junit.Test;
/**
 * 
 *@ClassName ClassAdaptorTest.java
 *@Description  对象的适配器测试类
 *@author 618
 *@date 2018年12月10日
 *
 */
public class ObjectAdaptorTest {

	@Test
	public void testMain() {
		Source source = new Source();
		Targetable a = new Wrapper(source);
		a.method1();
		a.method2();
	}
}
