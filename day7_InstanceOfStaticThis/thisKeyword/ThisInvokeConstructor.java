package com.day7_InstanceOfStaticThis.thisKeyword;

//4. this keyword is invoking the current class constructor
class D
{
	// default constructor
	D()
	{
		// this keyword is invoking the current class constructor
		this(12);
		System.out.println("Default Constructor");
	}
	// parameterized constructor
	D(int i)
	{
		System.out.println("Parameterized  Constructor");
	}
}

public class ThisInvokeConstructor {

	public static void main(String[] args) {
		// object creation
		D d=new D();

	}

}
