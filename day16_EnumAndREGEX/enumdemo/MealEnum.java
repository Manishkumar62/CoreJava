package com.day16_EnumAndREGEX.enumdemo;

enum Meal{
	BREAKFAST(4), LUNCH(7), DINNER(10);
	
	private int value;
	
	Meal(int val) {
		this.value = val;
	}

	public int getValue() {
		return value;
	}
	
}

public class MealEnum {

	public static void main(String[] args) {
		//we cannot cerate the object for enum
		//Mean m = new Meal();
		for(Meal m:Meal.values()) {
			System.out.println(m+" "+m.getValue());
		}
	}

}
