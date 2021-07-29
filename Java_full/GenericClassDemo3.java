package com.ust.examples;

class GenericsDemo <T extends Number> {
	public void display() {
		System.out.println("This is a bounded type generic class.");
	}
}

public class GenericClassDemo3 {

	public static void main(String[] args) {
		
		GenericsDemo<Number> gd = new GenericsDemo<>();
		gd.display();

	}

}
