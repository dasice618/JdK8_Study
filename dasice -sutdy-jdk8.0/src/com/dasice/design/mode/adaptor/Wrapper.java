package com.dasice.design.mode.adaptor;
/**
 * 
 *@ClassName Wrapper.java
 *@Description  对象适配器
 *@author 618
 *@date 2018年12月10日
 *
 */
public class Wrapper implements Targetable {
	private Source source;
	
	public Wrapper(Source source) {
		this.source = source;
	}
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
