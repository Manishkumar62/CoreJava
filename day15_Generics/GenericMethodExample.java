package com.day15_Generics;

public class GenericMethodExample {
	
	public static <E>void printArray(E[] arr){
		
		for(E itr: arr) {
			//to check the className
			System.out.println(itr.getClass().getName());
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
		//Integer array
		Integer[] intArr = {10,20,30};
		//Character array
		Character[] charArr = {'a', 'b', 'z'};
		System.out.println("Print Array for Integer");
		printArray(intArr);
		System.out.println("Print Array for Character");
		printArray(charArr);

	}

}
