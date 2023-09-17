package com.day11_ComparatorListMapSet.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	//@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//set is an interface, we can't create object for set
		/*	Set s = new Set<>();
			s.add("Manish");
			s.add(5);
			System.out.println("The element of set: "+ s);	*/
		
		
		//HashSet is unordered and is does not contain duplicate
		//Set contain at most one null element
		Set<Object> s = new HashSet<>();
		s.add("Manish");
		s.add('M');
		s.add(88.20f);
		s.add(77);
		s.add("Manish");
		s.add(null);
		s.add(null);
		
		System.out.println("The elements of set are: "+ s);

	}

}
