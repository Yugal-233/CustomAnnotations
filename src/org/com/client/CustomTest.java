package org.com.client;

import java.lang.reflect.Method;

import org.com.custannotations.Customannotations;

public class CustomTest {
	
	@Customannotations(name = "Yugal", arr = {"cdv","scsc","scsvs"},value = 20)
	public void doIt() {
		System.out.println("Hi I am using custom annotations");
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		CustomTest customTest = new CustomTest();
		Method method = customTest.getClass().getMethod("doIt");
		Customannotations customannotations = method.getAnnotation(Customannotations.class);
		System.out.println("Value of my annotation is  ::" +customannotations.name()+"  "+customannotations.arr()+"  "+customannotations.value());
		
	}

}
