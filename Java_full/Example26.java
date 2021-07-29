package com.ust.examples;

public class Example26 {
	int x;
	float y;
	String z;
	
	Example26(int a, float b){
		
		
		x = a;
		y = b;
	}
	Example26(int a, float b, String c){
		this(a,b);
		z = c;
	}
	public static void main(String[] args) {
		
		
		
		Example26 e2 = new Example26(2,3.0f, "HEllo");
		System.out.println(e2.x);
		System.out.println(e2.y);
		System.out.println(e2.z);

	}

}
