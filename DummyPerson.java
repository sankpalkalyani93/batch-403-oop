package com.example;

public class DummyPerson {

	String name = "IT-Vedant";
	
	public DummyPerson() {
		System.out.println("Object created : Name : " + name);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Your object finalized/ disposed.");
	}
	
	
}
