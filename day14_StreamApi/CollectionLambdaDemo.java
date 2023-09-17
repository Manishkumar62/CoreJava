package com.day14_StreamApi;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) {
		Set<Integer> obj = new HashSet<>();
		obj.add(11);
		obj.add(22);
		obj.add(33);
		obj.add(44);
		System.out.println(obj);
		
		for(Integer itr: obj) {
			System.out.print(itr+" ");
		}

		System.out.println();
		//instead of using loop statement we ca extract element using one line of
		//stream api
		obj.forEach(System.out::println);
	}

}
