package com.day10_Exception.exception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsKeyword {
	
	//throws is use to declare the exception
	public static void print(int x) throws IOException{
		if(x==1) {
			System.out.println("Input is equal");
		}else {
			throw new IOException("IOException Occurred");
		}
	}

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number x: ");
			int x=s.nextInt();
			print(x);
			s.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
