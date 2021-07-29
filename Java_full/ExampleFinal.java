package com.ust.examples;
/*
 * 
 * Final variable, Final method, final class
 * 
 */
public class ExampleFinal {
	int a; //instance variable
	final int b;
	
	ExampleFinal() {
		a = 7;
		b = 2;
	}
	
	
	
	public static void main(String[] args) {
		final int x; // x is a local variable and is also made final
		x = 50;
		//x = 4; final local variable may be already exit
		
		System.out.println(x);
		
		ExampleFinal e1 = new ExampleFinal();
		System.out.println(e1.a);
		System.out.println(e1.b);
		e1.a = 10;
		System.out.println(e1.a);
	}
}
