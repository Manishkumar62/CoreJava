package com.day16_EnumAndREGEX.enumdemo;

interface CardInterface{
	void print();
}

enum Cards implements CardInterface{
	HEART,CLUB,DIAMOND,SPADES;
	
	public void print() {
		System.out.println("Selected shape in the cards are: "+this);
	}
}

public class CardsEnum {

	public static void main(String[] args) {
		Cards.DIAMOND.print();

	}

}
