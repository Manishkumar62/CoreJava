package com.day12_DateTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		LocalDate d1 = LocalDate.of(2023, 7, 17);
		
		System.out.println("LocalDate: "+d);
		System.out.println("LocalTime: "+t);
		System.out.println("LocalDateTime: "+dt);
		System.out.println("LocalDate d1: "+d1);

	}
	
	private static LocalDateTime now() {
		return null;
	}

}
