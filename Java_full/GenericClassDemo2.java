package com.ust.examples;

class GenericDemo {
	public <T> void genericMethod(T data) {
		System.out.println("Generic Method: ");
		System.out.println("Data Passed: "+data);
	}
}

public class GenericClassDemo2 {

	public static void main(String[] args) {
		GenericDemo gd = new GenericDemo();
		gd.<String>genericMethod("Hello World");
		gd.<Integer>genericMethod(54);

	}

}
