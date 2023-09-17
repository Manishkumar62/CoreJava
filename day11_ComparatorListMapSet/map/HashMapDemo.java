package com.day11_ComparatorListMapSet.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String>mp = new HashMap<>();
		
		//Key - can't be duplicated but value can be duplicated
		//it follows the sorting order
		mp.put(1, "Manish");
		mp.put(4, "Ankur");
		mp.put(2, "Gaurav");
		mp.put(1, "Saikumar");
		mp.put(null, null);
		mp.put(5, null);
		System.out.println("The element of map: "+mp);
		
		mp.remove(1);
		System.out.println("The element after removing 1th key: "+mp);
		
		//to extract the pairs from map
		for(Map.Entry e:mp.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
