package com.example;

public class Person4 {

	String name;
	int age;
	String email;
	
	// Constructor Overloading 
	public Person4() {
		System.out.println("Inside Default Constructor : Name : " + name + ", Age : " + age + ", Email : " + email);
	}
	
	public Person4(String name, int age, String email) {
		this.name = name; // in this case the this keyword is used to refer to class variables name, age and email
		this.age = age;
		this.email = email;
		System.out.println("Inside Parametrized Constructor : Name : " + name + ", Age : " + age + ", Email : " + email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person4 p41 = new Person4();
		Person4 p42 = new Person4("kalyani", 31, "sankpalkalyani93@gmail.com");
	}

}
