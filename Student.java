package com.oop2;

public class Student extends Person {
	
	String college;
	String course;
	
	void acceptStudent() {
		System.out.println("Enter college name : ");
		college = scan.next();
		System.out.println("Enetr course : ");
		course = scan.next();
	}
	
	void displayStudent() {
		System.out.println("College : " + college + ", Course : " + course);
	}
	
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		super.calculate();
		System.out.println("I will be calculating total marks obtained by students");
	}
}
