package com.dasice.jdk8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 *@ClassName RepeatingAnnotations.java
 *@Description  重复注解@Repeatable
 *@author 618
 *@date 2018年12月9日
 *
 */
public class RepeatingAnnotations {
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters {
		Filter[] value();
	}
	
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)
	public @interface Filter {
		String value();
		String value2();
	}
	@Filter(value="filter1",value2="111")
	@Filter(value="filter2",value2="222")
	//@Filters({@Filter(  value="filter1",value2="111" ),@Filter(  value="filter2", value2="222")}).注意：JDK8之前：1.没有@Repeatable2.采用本行“注解容器”写法
	public interface Filterable {
		
	}
	
	public static void main(String[] args) {
		for(Filter filter:Filterable.class.getAnnotationsByType(Filter.class)) {
			System.out.println(filter.value() + "-" + filter.value2());
		}
	}
}
