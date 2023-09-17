package com.day17_JavaAnnotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnoDemo.class)
@interface CustomAnnotation{
	String print() default "This is Manish";
	int value() default 0;
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnoDemo{
	CustomAnnotation[] value();
}

public class RetentionAnnotationDemo {
	
	@CustomAnnotation(print="Retention Annotation Test", value=1)
	@CustomAnnotation(print="testing annotation", value=2)
	
	public static void testMethod() {
		RetentionAnnotationDemo d = new RetentionAnnotationDemo();
		try {
			Class<?> c = d.getClass();
			Method m = c.getMethod("testMethod");
			Annotation a = m.getAnnotation(MyRepeatedAnnoDemo.class);
			System.out.println(a);
		}
		catch(NoSuchMethodException e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		testMethod();

	}

}
