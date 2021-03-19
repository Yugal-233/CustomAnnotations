package org.com.client;

import java.lang.reflect.Method;

import org.com.custannotations.MyAnnotations;

public class Test {
	@MyAnnotations(developerName = "Raghav", myDate = "10-02-1995")
	public void myMethod() {
		System.out.println("Method first");
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Method method = new Test().getClass().getMethod("myMethod");
		MyAnnotations myAnnotations = method.getAnnotation(MyAnnotations.class);
		System.out.println("Name "+myAnnotations.developerName()+"  Date  "+myAnnotations.myDate());
				
	}

}
