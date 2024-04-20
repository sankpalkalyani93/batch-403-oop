package com.example;

import java.util.Scanner;

public class Person {
	// Scanner Object
	Scanner scan = new Scanner(System.in);
	
	// variables;
	String name;
	int age;
	String email;
	long phoneNumber;
	String city;
	int pincode;
	
	// functions;
	void acceptPersonInfo() {
		System.out.println("Enter person information ");
		System.out.println("Enter name : ");
		name = scan.next();
		System.out.println("Enter age : ");
		age = scan.nextInt();
		System.out.println("Enter email : ");
		email = scan.next();
		System.out.println("Enter phone number : ");
		phoneNumber = scan.nextLong();
		System.out.println("Enter city : ");
		city = scan.next();
		System.out.println("Enter pincode : ");
		pincode = scan.nextInt();
	}
	
	void displayPersonInfo() {
		System.out.println("******* Person information ******** ");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Email : " + email);
		System.out.println("Phone number : " + phoneNumber);
		System.out.println("City : " + city);
		System.out.println("Pincode : " + pincode);
	}
	
	void sing() {
		System.out.println("Person " + name + " sings.");
	}
	
	public static void main(String [] args) {
		
		Person p1 = new Person();
		p1.acceptPersonInfo();
		p1.displayPersonInfo();
		p1.sing();
	}
}
