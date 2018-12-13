package com.dasice.design.mode.decorator;

import org.junit.Test;

/**
 * 
 *@ClassName DecoratorTest.java
 *@Description  测试主方法
 *@author 618
 *@date 2018年12月10日
 *
 */
public class DecoratorTest {
	@Test
	public void testMain() {
		Decorator a = new Decorator(new Source());
		a.method();
	}
}
