package com.day16_EnumAndREGEX.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSplitDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with @ keyword: ");
		String str = sc.nextLine();
		sc.close();
		String delimiter = "@";
		Pattern p = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
		String [] res = p.split(str);
		for(String s1:res) {
			System.out.println(s1);
		}

	}

}
