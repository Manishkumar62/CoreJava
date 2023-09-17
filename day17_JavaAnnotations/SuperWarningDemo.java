package com.day17_JavaAnnotations;

import java.util.Scanner;

public class SuperWarningDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		//this annotation is use to remove warnings which occured at the complie time
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		sc.close();
		System.out.println(x);
	}

}
