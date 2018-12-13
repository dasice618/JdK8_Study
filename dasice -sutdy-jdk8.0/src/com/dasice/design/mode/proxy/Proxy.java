package com.dasice.design.mode.proxy;

public class Proxy  implements Sourceable{
	private Sourceable source;
	public Proxy() {
		source = new Source();
	}
	@Override
	public void method() {
		before();
		System.out.println("this is proxy method");
		after();
	}
	private void after() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }  
}
