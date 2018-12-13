package com.dasice.design.mode.builder;

import org.junit.Test;

public class TestMain {
	@Test
	public void testMain() {
		Builder a = new Builder();
		a.produceMailSender(10);
	}
}
