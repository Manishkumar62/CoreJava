package com.day11_ComparatorListMapSet.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Double> list = new Vector<Double>();
		list.add(0, 88.20);
		list.add(1, 70.31);
		
		System.out.println("The vector element is: "+ list);

	}

}
