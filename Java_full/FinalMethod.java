package com.ust.examples;

class Base {
	final void display() {
		System.out.println("Base method called");
	}
}

class Derived extends Base {
	void newdisplay() {
		System.out.println("Derived method called");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		Base d = new Derived();
		Derived d1 = new Derived();
		d1.newdisplay();
		d.display();

	}

}
