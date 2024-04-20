package com.oop2;

public class TestMethodOverloading2 {

	public void calculate(int side) {
		System.out.println("Inside calculate(int side)...");
	}
	
	public void calculate(int x, float y) {
		System.out.println("Inside calculate(int x, float y)...");
	}
	
	public void calculate(float x, int y) {
		System.out.println("Inside calculate(float x, int y)...");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethodOverloading2 tmo2 = new TestMethodOverloading2();
		tmo2.calculate(4);
		tmo2.calculate(2, 2.2f);
		tmo2.calculate(2.0f, 2);
	}

}
