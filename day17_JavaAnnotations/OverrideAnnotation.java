package com.day17_JavaAnnotations;

class Parent{
	public void print() {
		System.out.println("ParentClass");
	}
}

class Child extends Parent{
	@Override
	public void print() {
		super.print();
		System.out.println("ChildClass");
	}
}

public class OverrideAnnotation {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();

	}

}
