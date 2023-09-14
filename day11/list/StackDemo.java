package com.day11.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>s=new Stack<Integer>();
		
		//push - insertion
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("The element is stack is: "+ s);
		
		//pop - deletion
		s.pop();
		
		//remove - deletion of ith index element
		//s.remove(0);
		System.out.println("The element after pop(): "+s);

	}

}
