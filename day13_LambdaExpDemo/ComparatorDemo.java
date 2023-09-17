package com.day13_LambdaExpDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		Comparator<String>obj = (s1,s2) -> Integer.compare(s1.length(), s2.length());
		
		String str[] = {"Gaurav", "Avinash", "Saikumar", "Manish"};
		//arrange into the ascending order
		Collections.sort(Arrays.asList(str), obj);
		//enhanced for loop to return the String
		for(String s:str) {
			System.out.println(s+" ");
		}

	}

}
