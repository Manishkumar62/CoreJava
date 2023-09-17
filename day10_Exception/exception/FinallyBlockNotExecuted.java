package com.day10.exception;

public class FinallyBlockNotExecuted {
	
	public static void print() {
		try {
			int a=10;
			int b=0;
			System.out.println("Inside try block"+a/b);
			//no any further statement will execute
			System.exit(0);
		}
		catch (Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
		print();

	}

}
