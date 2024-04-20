package com.oop2;

public abstract class Calculate {  // may have only method prototype
								   // logically implemented methods as well
	int x, y;
	public abstract void addition();
	public void display() {
		System.out.println("Value of x : " + x + ", y : " + y);
	}
}
