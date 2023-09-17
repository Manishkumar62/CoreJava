package com.day14_StreamApi;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String> obj = Arrays.asList(new String[] {"Manisha", "Urvashi", "Nisha", "Payal", "Shrusti"});
		obj.stream().filter((i -> i.length()>5)).forEach((i) -> System.out.println(i+" "));

	}

}
