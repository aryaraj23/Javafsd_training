package com.ust.examples;

class Animals{
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}

class Dog extends Animals{
	public void display() {
		System.out.println("My name is\s"+name);
	}
}
public class MainAnimals {
	
	public static void main(String[] args) {
		Dog labrador = new Dog();
		
		labrador.name = "Bruno";
		labrador.display();
		
		labrador.eat();

	}

}
