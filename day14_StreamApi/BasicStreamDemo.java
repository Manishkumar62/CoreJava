package com.day14_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String> obj = Stream.of("Manish", "Anish", "Nisha", "Manisha");
		obj.forEach((i) -> System.out.print(i+" "));
		
		System.out.println();
		
		//Stream can be acquired from Arrays or Collections
		
		List<Integer> obj1 = Arrays.asList(new Integer[] {11,22,33,44});
		obj1.forEach((i) -> System.out.print(i+" "));

	}

}
