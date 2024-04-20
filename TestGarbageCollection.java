package com.example;

public class TestGarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DummyPerson dp1 = new DummyPerson();
		DummyPerson dp2 = new DummyPerson();
		
		dp1.name = "kalyani";
		System.out.println("New Object Name : " + dp1.name);
		
		dp2 = null;
		//System.out.println("DP2" + dp2.name);
		System.gc();
	}

}
