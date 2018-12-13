package com.dasice.jdk8;

public interface JDK8Interface2 {
	//1：接口中可以定义静态方法了
		public static void staticMethod() {
			System.out.println("接口中的静态方法");
		}	
		//2:使用default之后可以定义普通方法的方法体了
		public default void defaultMethod() {
			System.out.println("接口中的默认方法实现");
		};	
}
