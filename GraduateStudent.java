package com.oop2;

public class GraduateStudent extends Student{
	
	String specialization;
	
	void acceptGraduateStudent() {
		System.out.println("Enter specialization : ");
		specialization = scan.next();
	}
	
	void displayGraduateStudent() {
		System.out.println("specialization in " + specialization);
	}
}
