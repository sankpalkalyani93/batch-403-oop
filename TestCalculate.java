package com.oop2;

public class TestCalculate extends Calculate{

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println(100 + 200);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCalculate tc = new TestCalculate();
		tc.x = 23;
		tc.y = 23;
		tc.display();
		tc.addition();
	}

}
