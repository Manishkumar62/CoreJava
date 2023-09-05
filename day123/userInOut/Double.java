package com.day123.userInOut;
import java.util.Scanner;

public class Double {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value of x: ");
			double x=s.nextDouble();
			System.out.println("The result is: ");
			System.out.print(x);
			s.close();
		}

	}
