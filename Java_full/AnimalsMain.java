package com.ust.examples;
/*
 * Abstract Example
 */
abstract class Pets{
	abstract void makeSound();
}
class Dogs extends Pets {
	public void makeSound() {
		System.out.println("Bark Bark...");
	}
}

class Cats extends Pets {
	public void makeSound() {
		System.out.println("Meows...");
	
	}
}
public class AnimalsMain {

	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		d1.makeSound();
		
		Cats c1 = new Cats();
		c1.makeSound();

	}

}
