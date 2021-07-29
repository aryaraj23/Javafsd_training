package com.ust.examples;
/*
 * 
 *example of switch cases
 * 
 */

public class Example4 {

	public static void main(String[] args) {
		String colorcode = "green";
		switch(colorcode) {
		case "red":
			System.out.println("Stop");
			break;
		case "green":
			System.out.println("Go");
			break;
		case "orange":
			System.out.println("ready");
			break;
		default:
			System.out.println("go home");
			break;
		}
	}

}
