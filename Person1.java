package com.example;

public class Person1 {

	String name;	// null
	int age;		// 0
	String email;	// null
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Email : " + email);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1();  // when constructor is not defined by the programmer, 
								     // it will be given by jvm
		p1.display();
		
	}

}
