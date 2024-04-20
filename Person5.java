package com.example;

public class Person5 {

	String name;
	int age;
	String email;
	
	public Person5() {
		name = "akash";
		age = 32;
		email = "akash@gmail.com";
		System.out.println("Inside Default Constructor : Name : " + name + ", Age : " + age + ", Email : " + email);
	}
	
	public Person5(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
		System.out.println("Inside Parametrized Constructor : Name : " + name + ", Age : " + age + ", Email : " + email);
	}
	
	public Person5(Person5 p) { // copying the values of one object passed as parameter to constructor, to another object
		this.name = p.name;
		this.age = p.age;
		this.email = p.email;
		System.out.println("After copying object values : Name : " + name + ", Age : " + age + ", Email : " + email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person5 p51 = new Person5();
		Person5 p52 = new Person5("ajinkya", 29, "ajinkya@gmail.com");
		
		Person5 p53 = new Person5(p51);
		
	}

}
