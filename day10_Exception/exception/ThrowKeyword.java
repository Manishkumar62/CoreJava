package com.day10_Exception.exception;

public class ThrowKeyword {
	public static void display(int age, int weight) {
		if(age>18 && weight>45) {
			System.out.println("Eligible to donate the blood");
		}else {
			//to throw an exception explicitly
			throw new ArithmeticException("Not eligible");
		}
	}

	public static void main(String[] args) {
		try {
			display(20,35);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
