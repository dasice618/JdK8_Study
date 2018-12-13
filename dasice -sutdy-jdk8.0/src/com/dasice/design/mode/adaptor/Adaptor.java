package com.dasice.design.mode.adaptor;
/**
 * 类的适配器模式
 *@ClassName Adaptor.java
 *@Description  
 *@author 618
 *@date 2018年12月10日
 *
 */
public class Adaptor extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");
	}

}
