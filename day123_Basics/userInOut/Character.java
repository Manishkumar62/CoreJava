package com.day123.userInOut;
import java.util.Scanner;

public class Character{

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		char x=s.next().charAt(2);
		System.out.println("The third character is: ");
		System.out.print(x);
		s.close();
	}

}