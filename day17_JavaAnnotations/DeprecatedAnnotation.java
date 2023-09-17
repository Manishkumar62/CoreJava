package com.day17_JavaAnnotations;

class DeprecatedDemo{
	@Deprecated
	public void display() {
		System.out.println("My name is GROOT");
	}
	
}

public class DeprecatedAnnotation {

	public static void main(String[] args) {
		DeprecatedDemo d = new DeprecatedDemo();
		d.display();

	}

}
