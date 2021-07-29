package com.ust.examples;

import java.util.LinkedHashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hml = new LinkedHashMap<Integer, String>();
		
		hml.put(3, "Example");
		hml.put(2, "of");
		hml.put(1, "LinkedHashMap");
		
		System.out.println("Mappings of LinkedHasMAp: "+hml);
	}

}
