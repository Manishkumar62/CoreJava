package com.day6.finalKeyword;

class FinalClass
{
	protected String name="Mohan";
}
//final class cannot be inherited
/*final class FinalClass
{
	protected String name="Jenny";
	
}*/
//child class(Inheritance)
class ChildFinal extends FinalClass
{
	public void print()
	{
		System.out.println(name);
	}
}

public class FinalOnClass {

	public static void main(String[] args) {
		ChildFinal c=new ChildFinal();
		c.print();

	}

}
