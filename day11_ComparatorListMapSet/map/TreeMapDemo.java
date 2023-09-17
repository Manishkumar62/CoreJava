package com.day11_ComparatorListMapSet.map;

import java.util.Map;
import java.util.NavigableMap;
//import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//Tree Map does not contain null key but contain null value
		/*	SortedMap<String, String>sm= new TreeMap<>();
			sm.put("Manish", "Director");
			sm.put("Gaurav", "actor");
			sm.put("Ankur", "Producer");
			System.out.println("The sortedmap is: "+sm);
			
			for(Map.Entry i:sm.entrySet()) {
				System.out.println(i.getKey()+ " " + i.getValue());
			}
			
			System.out.println("The first entry: "+ sm.firstKey());
			System.out.println("The last entry: "+ sm.lastKey());	*/
		
		NavigableMap<String, String>nm= new TreeMap<>();
		nm.put("Manish", "Director");
		nm.put("Gaurav", "actor");
		nm.put("Ankur", "Producer");
		System.out.println("The sortedmap is: "+nm);
		
		for(Map.Entry i:nm.entrySet()) {
			System.out.println(i.getKey()+ " " + i.getValue());
		}
		
		System.out.println("The first entry: "+ nm.firstEntry());
		System.out.println("The last entry: "+ nm.lastEntry());
		System.out.println("The last key: "+ nm.lastKey());

	}

}
