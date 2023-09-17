package com.day6.superKeyword;

class Person
{
	//super class constructor
	Person()
	{
		System.out.println("Parent class default constructor");
	}
	Person(int i)
	{
		System.out.println("Parent class parameterized constructor"+i);
	}
}
class Student extends Person
{
	Student()
	{
		//to call the parent class constructor
		super();
		System.out.println("Child class default constructor");

	}
	Student(int i)
	{
		//to call the parent class constructor
		super(i);
		System.out.println("Child class parameterized constructor"+i);

	}
}

public class SuperOnConstructor {

	public static void main(String[] args) {
		Student s=new Student();
		Student y=new Student(50);

	}

}
