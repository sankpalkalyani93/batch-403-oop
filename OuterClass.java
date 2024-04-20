package com.example;

public class OuterClass {

	public int x = 100;
	
	public void displayX() {
		System.out.println("Value of x : " + x);
	}
	
	public class InnerClass{
		
		public int y = 50;
		
		public void displayY() {
			System.out.println("Value of y : " + y);
		}
		
		public void additionInnerClass() {
			displayY();
			displayX();
			System.out.println("Addition inside inner class : " + (x + y));
		}
	}
	
	/*public void additionOuterClass() {
		System.out.println("Addition in outer class : " + (x + y));
	}*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass oout = new OuterClass();
		oout.displayX();
		
		OuterClass.InnerClass oin = oout.new InnerClass();
		oin.displayY();
		
		oin.additionInnerClass();
	}

}
