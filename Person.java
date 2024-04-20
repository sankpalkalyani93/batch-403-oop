package com.oop2;

import java.util.Scanner;

public class Person {
	Scanner scan = new Scanner(System.in);
	String name;
	int age;
	
	void acceptPerson() {
		System.out.println("Enter name : ");
		name = scan.next();
		System.out.println("Enter age : ");
		age = scan.nextInt();
	}
	
	void displayPerson() {
		System.out.println("Name : " + name + ", Age : " + age);
	}
	
	void calculate() {
		System.out.println("Calcuating.....");
	}
}
