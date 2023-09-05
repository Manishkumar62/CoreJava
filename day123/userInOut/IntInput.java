package com.day123.userInOut;
import java.util.Scanner;

public class IntInput {
	public static void main(String[] args) {
		//for user input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer value: ");
		int x=s.nextInt();
		System.out.println("The result is: ");
		System.out.print(x);
		s.close();

	}

}
