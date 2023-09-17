package com.day14_StreamApi;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {

	public static void main(String[] args) {
		List<String> obj = Arrays.asList(new String[] {"Manisha", "Urvashi", "Nisha", "Payal", "Shrusti"});
		obj.stream().map(i -> i.length()).forEach(i -> System.out.print(i+" "));

	}

}
