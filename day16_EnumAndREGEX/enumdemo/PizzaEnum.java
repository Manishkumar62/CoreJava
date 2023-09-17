package com.day16_EnumAndREGEX.enumdemo;

import java.util.Scanner;

class PizzaSize{
	enum Size{
		SMALL,MEDIUM,LARGE,EXTRALARGE
	};
}

public class PizzaEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of pizza: ");
		String size = sc.nextLine();
		PizzaSize.Size s1 = PizzaSize.Size.valueOf(size.toUpperCase());
		sc.close();
		switch(s1) {
			case SMALL:
				System.out.println("Size is SMALL");
				break;
			case MEDIUM:
				System.out.println("Size is MEDIUM");
				break;
			case LARGE:
				System.out.println("Size is LARGE");
				break;
			case EXTRALARGE:
				System.out.println("Size is EXTRALARGE");
				break;
		}

	}

}
