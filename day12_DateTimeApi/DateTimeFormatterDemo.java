package com.day12_DateTimeApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("BeforeFormat: "+ldt);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yy HH:mm:ss");
		
		String dt = ldt.format(dtf);
		System.out.println("AfterFormat: "+dt);

	}

}
