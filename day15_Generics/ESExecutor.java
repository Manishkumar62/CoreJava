package com.day15_Generics;

public class ESExecutor {

	public static void main(String[] args) {
		
		//create a sender to send string message
		Sender<String> stringSender = new Sender<String>();
		stringSender.setMessage("Hello my name is manish");
		stringSender.sendMessage();
		
		//create an email object to be sent by sender
		Email myEmail = new Email();
		myEmail.setFrom("manish@gmail.com");
		myEmail.setTo("gaurav@gmail.com");
		myEmail.setSubject("Need to know about your exam");
		myEmail.setBody("To celebrate for results");
		
		//create a sender to send email
		Sender<Email> emailSender = new Sender<Email>();
		emailSender.setMessage(myEmail);
		emailSender.sendMessage();

	}

}
