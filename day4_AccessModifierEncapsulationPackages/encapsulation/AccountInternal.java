package com.day4_AccessModifierEncapsulationPackages.encapsulation;

public class AccountInternal {
	private int Account_No;
	private String Account_Name;
	private double Account_Amount;
	public int getAccount_No() {
		return Account_No;
	}
	public void setAccount_No(int account_No) {
		Account_No = account_No;
	}
	public String getAccount_Name() {
		return Account_Name;
	}
	public void setAccount_Name(String account_Name) {
		Account_Name = account_Name;
	}
	public double getAccount_Amount() {
		return Account_Amount;
	}
	public void setAccount_Amount(double account_Amount) {
		Account_Amount = account_Amount;
	}
	

}
