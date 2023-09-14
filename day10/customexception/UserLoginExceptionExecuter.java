package com.day10.customexception;

import java.util.Scanner;

public class UserLoginExceptionExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter email id: ");
		String id = s.nextLine();
		System.out.println("Enter password");
		String password = s.nextLine();
		try {
			if(id!="manish@gmail.com" && password!="Manish@") {
				throw new UserLoginException("Invalid Credential");
			}else {
				System.out.println("Credentials Matched");
			}
		}
		catch(UserLoginException e) {
			System.out.println("Exception Handled"+e);
		}
		s.close();

	}

}
