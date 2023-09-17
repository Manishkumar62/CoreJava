package com.day13_LambdaExpDemo;

public class FunctionalInterfaceExampleExecutor {

	public static void main(String[] args) {
		FunctionalInterfaceExample obj = (int a, int b) ->{
			int result = (a>b)?a:b;
			return result;
		};
		System.out.println("The max number is: "+obj.max(34, 55));
		
		FunctionalInterfaceExample obj1 = (a,b) -> a>b?a:b;
		System.out.println("The max number is: "+obj1.max(34, 55));
	}

}
