package com.example;

public class Person3 {

	String name;
	int age;
	String email;
	
	public Person3(String name, int a, String e) {
		this.name = name;
		age = a;
		email = e;
		System.out.println("Person Information : Name : " + name + ", Age : " + age + ", Email : " + email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person3 p3 = new Person3("kalyani-akash-dinde", 31, "sankpalkalyani93@gmail.com");
		
	}

}
