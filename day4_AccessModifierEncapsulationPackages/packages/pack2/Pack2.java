package com.day4_AccessModifierEncapsulationPackages.packages.pack2;
import java.util.Scanner;

import com.day4_AccessModifierEncapsulationPackages.packages.pack1.*;
public class Pack2 {

	public static void main(String[] args) {
		/* we are accessing the method of Pack1 class
		   import the package of the specified class */
		// object creation
		
		//user input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=s.nextLine();
		
		Pack1 d=new Pack1();
		d.str=str1;
		d.display();
		s.close();

	}

}
