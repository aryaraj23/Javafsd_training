package com.ust.examples;
/*
 * 
 * Check word
 * 
 */
public class Example16 {

	public static void main(String[] args) {
		String strOrg = "Hello World!";
		
		if(strOrg.endsWith("World!")) {
			System.out.println("String end with Worlds");
		}else {
			System.out.println("String does not end with Worlds");
		}

	}

}
