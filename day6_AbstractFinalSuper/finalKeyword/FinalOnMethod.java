package com.day6.finalKeyword;

class FinalMethod
{
	//final method cannot be overriden
	/*
	final void accept()
	{
		System.out.println("Final method cannot be override");
	}*/
}
class Child extends FinalMethod
{
	void accept()
	{
		System.out.println("Child class");
		
	}
	
}

public class FinalOnMethod {

	public static void main(String[] args) {
		Child c=new Child();
		c.accept();

	}

}
