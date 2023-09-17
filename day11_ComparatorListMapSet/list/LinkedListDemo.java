package com.day11_ComparatorListMapSet.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total int element to be shuffled: ");
		int x = s.nextInt();
		while(x!=0) {
			list.add(s.nextInt());
			x--;
		}
		Collections.shuffle(list);
		System.out.println("The shuffled list is: "+list);
		s.close();

	}

}
