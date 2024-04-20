package com.example;

public class TestAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greet g = new Greet() {
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Welcome to Anonymous class Demo");
			}
		};
		
		g.sayHello();
	}

}
