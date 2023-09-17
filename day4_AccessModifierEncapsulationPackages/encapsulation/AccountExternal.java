package com.day4.encapsulation;

public class AccountExternal {

	public static void main(String[] args) {
		AccountInternal Account = new AccountInternal();
		Account.setAccount_No(123456789);
		Account.setAccount_Name("Manish");
		Account.setAccount_Amount(50000.00);
		System.out.println("Account Number "+Account.getAccount_No());
		System.out.println("Account Name "+Account.getAccount_Name());
		System.out.println("Account Amount "+Account.getAccount_Amount());

	}

}
