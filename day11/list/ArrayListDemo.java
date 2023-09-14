package com.day11.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	//example on list interface using ArrayList
	public static void main(String[] args) {
		//creating a first list using ArrayList
		List<String> list = new ArrayList<String>();
		list.add("Manish");
		list.add("Gaurav");
		list.add("Ankur");
		
		//enhanced for loop is used to extract the element from ArrayList
		for(String it: list) {
			System.out.println(it);
		}
		
		List<String> list1 = new LinkedList<String>();
		list1.add("Manish");
		list1.add("Gaurav");
		list1.add("Ankur");
		
		//using iterator we can extract the element of list
		Iterator<String> it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("The element of list: "+list);
		System.out.println("The element of list1: "+list1);
		
		//contain() method is used to check whether the list contain that element or not
		System.out.println(list.contains("Neha"));
		
		//size() method is used to print the length
		System.out.println(list.size());
		
		//remove() is used to remove the specified index value
		System.out.println(list.remove(1));
		
		System.out.println("The element of list after 3 operation: "+list);
		
		//adding the list1 element to list
		list.addAll(list1);
		System.out.println("The element of list after adding list1: "+list);
		
		list.removeAll(list1);
		System.out.println("The element of list after removing list1: "+list);
		
		Collections.sort(list1);
		System.out.println("The element of list1 after using Collections.sort(): "+list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("The element of list1 after using Collections.reverseOrder(): "+list1);

	}

}
