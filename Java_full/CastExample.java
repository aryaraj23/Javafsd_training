package com.ust.examples;
/*
 * 
 * Up-casting and down-casting
 * 
 */
public class CastExample {

	public static void main(String[] args) {
		double num = 15.64;
		System.out.println(num);

		int n = (int)num; //down casting the double(8 byte) to int(4byte)
		System.out.println(n);
		
		int a = 23;
		System.out.println(a);
		
		double b = a; //upcasting the int(4 byte) to double(8 byte)
		System.out.println(b);
		
		float f=(float)6.3;
		byte bt = (byte)f;
		System.out.println(bt);
		
		long l = 7536;
		float f1 = (float)l;
		System.out.println(f1);
		
		int x = 12;
		String dbValue = String.valueOf(x);
		System.out.println(dbValue);
		
		dbValue = String.valueOf(l);
		System.out.println(dbValue);
		
		dbValue = String.valueOf(x);
		System.out.println(dbValue);
		
		dbValue = String.valueOf(num);
		System.out.println(dbValue);
		
		
	}

}
