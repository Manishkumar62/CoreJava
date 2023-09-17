package com.day10.customexception;

class UserLoginException extends Exception {
	public String str;

	//constructor
	public UserLoginException(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	
	}
}
