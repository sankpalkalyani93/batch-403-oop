package com.oop2;

public interface InterfaceCalculator {

	// abstract method
	public abstract void addition(int a, int b);
	
	// default
	default void subtraction(int x, int y) {
		System.out.println("Subtraction Result : " + (x - y));
	}
	
	// static method
	public static void multiplication(int x, int y) {
		System.out.println("Multiplication Result : " + (x * y));
	}
	
	private void division(int num, int den) {
		System.out.println("Division Result : " + (num / den));
	}
	
	default void display() {
		division(10, 4);
	}
}
