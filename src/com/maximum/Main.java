package com.maximum;

public class Main {

	public static void main(String[] args) {
		System.out.println("welcome to maximum problem");
		TestMaximum testmaximum = new TestMaximum(2,1,3);
		testmaximum.findMaximum();
		
		TestMaximum testmaximum2 = new TestMaximum(3.8f,1.7f,2.8f);
		testmaximum2.findMaxOfFloat();
	}

}
