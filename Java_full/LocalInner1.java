package com.ust.examples;

public class LocalInner1 {
	private int data = 30; //instance variable
	void display() {
		System.out.println("Data = "+data);
		int value = 50; // local variable 
		
		class Local {
			void msg() {
				System.out.println("Data = "+data);
				System.out.println("Value ="+value);
			}
		}
		Local l = new Local();
		l.msg();
	}
	
	public static void main(String[] args) {
		LocalInner1 l1 = new LocalInner1();
		l1.display();

	}

}
