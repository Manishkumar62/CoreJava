package com.day6_AbstractFinalSuper.abstractKeyword;
//abstract class
public abstract class Person {
	
	private String name;
	private String gender;
	// parameterized constructor
	public Person(String name, String gender) {	
		super();
		this.name = name;
		this.gender = gender;
	}
	//abstract method
	public abstract void work();
	
	//toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	} 
	
	//user-defined method  for change the name
	public void changeName(String newName)
	{
		name=newName;
	}

}
