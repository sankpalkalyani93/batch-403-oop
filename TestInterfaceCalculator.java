package com.oop2;

public class TestInterfaceCalculator implements InterfaceCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterfaceCalculator tic = new TestInterfaceCalculator();
		tic.addition(4, 10);
		tic.subtraction(10, 5);
		InterfaceCalculator.multiplication(4, 2);
		tic.display();
	}

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition Result : " + (a + b));
	}

}
