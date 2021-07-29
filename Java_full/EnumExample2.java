package com.ust.examples;

enum Level {
	LOW, MEDIUM, HIGH;
}

public class EnumExample2 {

	public static void main(String[] args) {
		//Level myVar = Level.MEDIUM;
		System.out.println(Level.values());
		for(Level l:Level.values()) {
			System.out.println(l.name());
		}

	}

}
