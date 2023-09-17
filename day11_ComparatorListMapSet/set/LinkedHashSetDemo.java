package com.day11_ComparatorListMapSet.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//LinkedHashSet follows the insertion order
		Set<Object> s = new LinkedHashSet<>();
		s.add("Manish");
		s.add('M');
		s.add(88.20f);
		s.add(77);
		s.add("Manish");
		s.add(null);
		s.add(null);
		
		//to extract ele from set
		for(Object itr: s) {
			System.out.println(itr);
		}
		
		System.out.println("The element os linkedhashset: "+s);

	}

}
