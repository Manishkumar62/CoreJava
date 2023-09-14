package com.day11.list;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo {

	public static void main(String[] args) {
		Collection<Object> obj = new ArrayList<>();
		obj.add("Manish");
		obj.add('k');
		obj.add(88.20f);
		System.out.println("The element of collection: "+obj);

	}

}
