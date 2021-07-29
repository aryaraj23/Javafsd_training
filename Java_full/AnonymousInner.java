package com.ust.examples;

abstract class Person {
	abstract void eat();
}

public class AnonymousInner {

	public static void main(String[] args) {
		Person p1 = new Person() {
			void eat() {
				System.out.println("Nice fruit!!");
			}
		};
		p1.eat();
	}

}
