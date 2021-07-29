package com.ust.examples;
/*
 * 
 * replace operators
 * 
 */
public class Example17 {

	public static void main(String[] args) {
		String str = "Replace Region";
		
		System.out.println(str.replace('R', 'A'));
		
		System.out.println(str.replaceFirst("Re", "Ra"));
		
		System.out.println(str.replaceAll("Re", "Ra"));
	}

}
