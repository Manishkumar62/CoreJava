package com.day7_InstanceOfStaticThis.thisKeyword;

//3. this can be pass as an argument in the method call
class C
{
	
	public void display(C c)
	{
		System.out.println("Display function invoked");
	}
	//User defined method
	public void print()
	{
		display(this);
	}
}

public class ThisOnMethodCall {

	public static void main(String[] args) {
		C c=new C();
		c.print();

	}

}
