package com.ust.examples;
/*
 * 
 * Abstract class
 * 
 */
abstract class Car {
	int x;
	abstract void insuranceDetails(); 
	void dispaly() {
		
	}
}






public class Hyundai extends Car {
	
	void insuranceDetails() {
		System.out.println("Please provide insurance details here...");
	}

	public static void main(String[] args) {
		Hyundai h = new Hyundai();
		//Car c = new car() abstract class cannot be initated
		Car c = new Hyundai();
		
		
		h.insuranceDetails();
		c.insuranceDetails();
	}

}
