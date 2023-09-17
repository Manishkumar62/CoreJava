package com.day15_Generics;

public class GenericClassExample<T> {
	T num;
	
	public void show() {
		System.out.println(num.getClass().getName());
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		//instead of using collections i have used generic class name and generic concept
		GenericClassExample<Double>dob = new GenericClassExample<>();
		dob.num = 10.57;
		dob.show();

	}

}
