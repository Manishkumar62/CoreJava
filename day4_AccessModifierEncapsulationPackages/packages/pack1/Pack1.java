package com.day4_AccessModifierEncapsulationPackages.packages.pack1;

public class Pack1 {
	public String str;
	/* if any method or variable is declared as default then that method or varible
	 * you cant access into another package */
	 /* 
	  * default method
	  
	void display()
	{
		System.out.println("The name of the string is: "+str);
	} */
	/* If you want to access that variable and method we have to make them as public */
	public void display()
	{
		System.out.println("The string is: "+str);
	}
}
