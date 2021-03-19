package org.com.custannotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotations {

	public abstract String developerName() default "Yugal Chaudhari";
	public abstract String myDate();
}
