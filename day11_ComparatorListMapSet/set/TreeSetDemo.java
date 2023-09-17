package com.day11_ComparatorListMapSet.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet<>();
		s.add("Manish");
		s.add("Gaurav");
		s.add("Ankur");
		
		System.out.println("The element of treeset: "+s);

	}

}
