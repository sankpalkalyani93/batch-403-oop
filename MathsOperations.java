package com.example;

import java.util.Scanner;

public class MathsOperations {
	
	Scanner scan = new Scanner(System.in);
	//1. No Returntype + No Parameter
	void addition() {
		int x, y;
		System.out.println("Enter value for x : ");
		x = scan.nextInt();
		System.out.println("Enter value for y : ");
		y = scan.nextInt();
		int result = x + y;
		System.out.println("Result of addition : " + result);
	}
	
	//2. No Returntype + Parameter 
	void division(int num, int den) {
		int result = num / den;
		System.out.println("Result of division : " + result);	
	}
	
	//3. Returntype + No Parameter
	int multiplication() {
		int x, y;
		System.out.println("Enter value for x : ");
		x = scan.nextInt();
		System.out.println("Enter value for y : ");
		y = scan.nextInt();
		int result = x * y;
		return result;
	}
	
	//4. Returntype + Parameter
	int subtraction(int x, int y) {
		int result = x - y;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsOperations m = new MathsOperations();
		m.addition();
		m.division(12, 4);
		int temp = m.multiplication();
		System.out.println("Result of multiplication : " + temp);
		temp = m.subtraction(10, 4);
		System.out.println("Result of subtraction : " + temp);
	}

}
