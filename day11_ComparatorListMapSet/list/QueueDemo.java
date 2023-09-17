package com.day11_ComparatorListMapSet.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		//Queue is an interface, we can't create object for it
		Queue<Character>list = new PriorityQueue<>();
		list.add('M');
		list.offer('a');
		list.offer('n');
		list.offer('i');
		for(Character c:list) {
			System.out.println(c);
		}
		System.out.println("The element in list: "+list);
		list.poll();
		System.out.println("The element of list after poll(): "+list);
		/*  list.poll();
			list.poll();
			list.poll(); */
		/*	list.remove();
			list.remove();
			list.remove();
			System.out.println(list);*/
//		list.remove();
//		System.out.println(list);
		
		//peek will give us head element
		System.out.println("The peek element is: "+list.peek());
	}

}
