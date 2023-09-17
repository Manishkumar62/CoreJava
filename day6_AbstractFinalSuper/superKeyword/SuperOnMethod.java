package com.day6_AbstractFinalSuper.superKeyword;

//super class
class Parent
{
	public void print()
	{
		System.out.println("Welcome to M03 Batch");
	}
	public void accept()
	{
		System.out.println("Super class method");
	}
}
//child class
class Child extends Parent
{
	//method overriding
	public void print()
	{
		System.out.println("Congratulation for your Selection in Screening");
	}
	public void accept()
	{
		System.out.println("child class method");
	}
	public void display()
	{
		print();
		accept();
		//calling the parent class method
		super.print();
		super.accept();
	}
}

public class SuperOnMethod {

	public static void main(String[] args) {
		Child c =new Child();
		c.display();

	}

}
