package com.day14_StreamApi;

import java.util.Arrays;
import java.util.List;

public class FilteringMethodDemo {

	public static void main(String[] args) {
		List<Integer> obj = Arrays.asList(new Integer[] {11,22,33,44,55,66});
		obj.stream().filter(i -> i>50).forEach(i -> System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().distinct().forEach(i -> System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().limit(3).forEach(i -> System.out.print(i+" "));
		
		System.out.println();
		
		obj.stream().skip(4).forEach(i -> System.out.print(i+" "));
	}

}
