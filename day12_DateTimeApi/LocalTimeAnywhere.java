package com.day12_DateTimeApi;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeAnywhere {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now(ZoneId.of("US/Alaska"));
		System.out.println("LocalTime of US/Alaska: "+t);
		for(String s:ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}

	}

}
