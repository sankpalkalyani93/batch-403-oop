package com.oop2;

public class CalculateAreas implements InterfaceArea{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateAreas c = new CalculateAreas();
		c.areaOfCircle(2);
		c.areaOfSquare(4);
	}

	@Override
	public void areaOfCircle(int radius) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle : " + (pi * radius * radius));
	}

	@Override
	public void areaOfSquare(int side) {
		// TODO Auto-generated method stub
		System.out.println("Area of square : " + (side * side));
	}

}
