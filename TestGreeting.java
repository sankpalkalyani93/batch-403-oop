package com.example;

// executable class : class having main method for execution
public class TestGreeting {

	public void show(Greeting greet) {
	
		greet.message = "Welcome all to Java Essential Session...!";
		greet.displayMessage();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeting g = new Greeting();
		TestGreeting tg = new TestGreeting();
		tg.show(g);
		
	}

}
