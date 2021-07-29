package com.ust.examples;
/*
 * Methods overloading
 */
public class Example8 {
	int x;
	int y;
	
	int calculate(int a, int b) { //a,b are parameters
		return a + b;
	}
	
	float calculate(float a, float b) { //a,b are parameters
		return a + b;
	}
	
	String calculate(String a, String b) {
		return a+b;
	 }
	 
	 void calculate(String a) {
		
	 }
	 
	 {
		 int z = 5;
		 System.out.println("z=" + z);	 //block
	}
	 
	 int z =7;
	 
	public static void main(String[] args) {
			Example8 e = new Example8();
			
		
			int m = e.calculate(5,6);
			float n = e.calculate(5.6f,6.5f);
			String o = e.calculate("Hello ","World" );
			
			System.out.println(m);
			System.out.println(n);
			System.out.println(o);
			
		}
		

	}


