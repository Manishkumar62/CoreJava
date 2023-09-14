package com.day10.customexception;

class CustomExp extends Exception{
	public String str;
	
	public CustomExp(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "CustomException [str=" + str + "]";
	}
}

public class SimpleCustomException {

	public static void main(String[] args) {
		/* in oder to use our own custom Exception, we have to create a new object of the class
		 * and throw it using the  throw keyword
		 */
		try {
			throw new CustomExp("user-defined-custom-exception");
		}
		catch(CustomExp e) {
			System.out.println(e.getMessage());
		}

	}

}
