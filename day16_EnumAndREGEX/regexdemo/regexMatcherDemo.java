package com.day16_EnumAndREGEX.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMatcherDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("Manish");
		Matcher m = p.matcher("My name is Manish");
		
		while(m.find()) {
			System.out.println("Pattern found at: "+m.start()+" "+m.end());
		}

	}

}
