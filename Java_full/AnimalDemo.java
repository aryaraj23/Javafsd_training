package com.ust.examples;

interface Animal {
	public void animalSound();
	public void sleep();
}

class Pig implements Animal{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}
public class AnimalDemo {

	public static void main(String[] args) {
		Pig mypig = new Pig();
		mypig.animalSound();
		mypig.sleep();

	}

}
