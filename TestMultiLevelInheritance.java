package com.oop2;

public class TestMultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraduateStudent gd = new GraduateStudent();
		gd.acceptPerson();
		gd.acceptStudent();
		gd.acceptGraduateStudent();
		
		gd.displayPerson();
		gd.displayStudent();
		gd.displayGraduateStudent();
	}

}
