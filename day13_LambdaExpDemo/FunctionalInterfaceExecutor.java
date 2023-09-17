package com.day13_LambdaExpDemo;

public class FunctionalInterfaceExecutor {

	public static void main(String[] args) {
		//lambda expression
		FunctionalInterfaceDemo obj = (String str) ->{
			return str;
		};
		System.out.println(obj.display("Wel come lambda expression"));

	}

}
