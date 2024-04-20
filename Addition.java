package com.example;

public class Addition {

	public static int addition(int... numbers) {
		int result = 0;
		for(int num : numbers) {
			result += num;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(addition(1,2,3,4,5,6,7,8,9,10));
		System.out.println(addition(100, 200, 300));
		System.out.println(addition(100, 1000, 4000, 7000));
	}

}
