package org.com.custannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Customannotations {
	
	String name() default "Yugal";
	int value() default 10;
	String [] arr() default {"Mon","Tues","Wed","Thus"};
	
}
