package com.day123.userInOut;
import java.util.Scanner;

public class StringInput {
	public static void main(String[] args) {
		// for user input
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first line: ");
		
		//the diff btwn next() and nextLine()
		/*next() will take only the first word of your sentence and
		 * nextLine() will take the complete sentence */
		String word = s.next();
		String line=s.nextLine();
		System.out.println("The first word is: "+word);
		System.out.println("The line is: "+line);
		s.close();

	}

}
