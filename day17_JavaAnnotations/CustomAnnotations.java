package com.day17_JavaAnnotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//custom annotations with multi-value annotations
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Custom{
	//abstract method
	String print();
	int speed();
	float salary();
}

class CustomAnnotationClass{
	@Custom(print="Hello dear!", speed=50, salary=60000.50f)
	public void display() {
		System.out.println("Sunday eat eggs everyday");
	}
}

public class CustomAnnotations {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		CustomAnnotationClass c = new CustomAnnotationClass();
		c.display();
		Method m = c.getClass().getMethod("display");
		Custom obj = m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.salary());

	}

}
