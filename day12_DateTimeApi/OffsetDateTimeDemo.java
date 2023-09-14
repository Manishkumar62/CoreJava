package com.day12_DateTimeApi;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class OffsetDateTimeDemo {

	public static void main(String[] args) {
		OffsetDateTime dt = OffsetDateTime.now();
		OffsetTime t = OffsetTime.now();
		System.out.println(dt);
		System.out.println(t);

	}

}
