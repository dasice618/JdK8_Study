package com.dasice.design.mode.decorator;
/**
 * 
 *@ClassName Decorator.java
 *@Description  装饰器模式
 *@author 618
 *@date 2018年12月10日
 *
 */
public class Decorator implements Sourceable{
	private Sourceable source;
	public Decorator(Sourceable source) {
		this.source = source;
	}
	@Override
	public void method() {
		System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!"); 
	}

}
