package com.oop2;

public class Employee extends Person{
	String company;
	int empno;
	float salary;

	void acceptEmployee() {
		System.out.println("Enter employee no : ");
		empno = scan.nextInt();
		System.out.println("Enter employee company : ");
		company = scan.next();
		System.out.println("Enter employee salary : ");
		salary = scan.nextFloat();
	}
	
	void displayEmployee() {
		System.out.println("Employee company : " + company +", Empno : " + empno + ", Salary : " + salary);
	}
}