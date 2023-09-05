package com.day123.conditions;

public class NestedIf {

	public static void main(String[] args) {
		int x=10, y=12;
		if(x==10)
		{
			if(y==12)
			{
				System.out.println("x=10 and y=12");
			}
			else 
			{
				System.out.println("x=10 and y!=12");
			}
		}
		else 
		{
			System.out.println("x!=10");
		}

	}

}
