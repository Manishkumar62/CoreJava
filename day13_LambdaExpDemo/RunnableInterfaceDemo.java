package com.day13_LambdaExpDemo;

public class RunnableInterfaceDemo {

	public static void main(String[] args) {
		/* Runnable is an interface which contain one method run() */
		Runnable obj = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Implementing runnable interface");
			}
		};
		/* Thread is a class that implementing runnable interface */
		Thread t = new Thread(obj);
		//when you call start method it call run method
		t.start();
		
		//runnable using lambda expression
		Runnable obj1 =() -> {
			System.out.println("Implementing runnable using lambda");
		};
		Thread t1 = new Thread(obj1);
		t1.start();

	}

}
