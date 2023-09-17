package com.day4_AccessModifierEncapsulationPackages.accessModifiers;
class B{
	//if any data member is public the visibility is in any class
	public String dob="12-01-1995";
	public void display(){
		System.out.print("The DOB is: "+dob);
	}
}

public class PublicAccess {

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}
