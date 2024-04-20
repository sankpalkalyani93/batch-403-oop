package com.oop2;

public class TestMethodOverloading {

	public void operations() {
		System.out.println("Inside operations() without any parameters");	
	}
	
	public int operations(int a, int b) {
		return a + b;
	}
	
	public String operations(String a, String b) {
		return a + " : " + b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethodOverloading tmo = new TestMethodOverloading();
		tmo.operations();
		System.out.println(tmo.operations(4,  5));
		System.out.println(tmo.operations("itvedant", "mumbai"));
	}

}
