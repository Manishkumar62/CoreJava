package com.day16_EnumAndREGEX.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regexPatternMethod {

	public static void main(String[] args) {
		String pattern = "Manish Vishwakarma";
		Scanner sc = new Scanner(System.in);
		System.out.println("Input matching string: ");
		String s = sc.nextLine();
		boolean b = Pattern.matches(pattern, s);
		System.out.println(b);

	}

}
