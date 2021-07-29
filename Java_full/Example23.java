package com.ust.examples;

public class Example23 {
	String web;
	
	Example23(String w){
		web = w;
	}
	
	Example23(Example23 c){
		web = c.web;
	}
	
	void display() {
		System.out.println("Constructor: "+web);
	}
	public static void main(String[] args) {
		Example23 e1 = new Example23("Copy Constructor");
		e1.display();

		Example23 e2 = new Example23(e1);
		e2.display();
	}

}
