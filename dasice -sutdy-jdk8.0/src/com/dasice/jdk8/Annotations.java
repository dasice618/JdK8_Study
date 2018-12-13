package com.dasice.jdk8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 *@ClassName Annotations.java
 *@Description  
 *@author 618
 *@date 2018年12月9日
 *
 */
public class Annotations {
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE_USE,ElementType.TYPE_PARAMETER})
	public @interface NonEmpty{
		
	}
	
	public static class Holder< @NonEmpty T> extends @NonEmpty Object {
		public void method() throws @NonEmpty Exception {
			
		}
	}
	
	public static void main(String[] args) {
		final Holder<String> holder = new @NonEmpty Holder<String>();
		@NonEmpty Collection<@NonEmpty String> strings = new ArrayList<>();
	}
}
