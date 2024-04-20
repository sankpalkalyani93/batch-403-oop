package com.example;

public class Person2 {

	String name;	// null
	int age;		// 0
	String email;	// null
	
	public Person2() {	// constructor explicitly mentioned by programmer
		name = "abc";
		age = 18;
		email = "abc@gmail.com";
		System.out.println("Inside constructor : Name : " + name + ", age : " + age + ", email : " + email);
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Email : " + email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person2 p2 = new Person2();
		p2.display();
	}

}
