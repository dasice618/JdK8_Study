package com.dasice.design.mode.signmode;

public class Signleton {
	private static Signleton instance = null;
	private Signleton() {
		
	}
	private static synchronized void syncInit() {
		if(instance==null) {
			instance = new Signleton();
		}
	}
	
	public static Signleton getInstance() {
		if(instance==null) {
			syncInit();
		}
		return instance;
	}
}
