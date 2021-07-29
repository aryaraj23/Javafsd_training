package com.ust.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(3, "Example");
		hm.put(2, "of");
		hm.put(1, "LinkedHashMap");
		
		for(Map.Entry<Integer, String> mapElement : hm.entrySet()) {
			Integer key = mapElement.getKey();
			
			String value = mapElement.getValue();
			
			System.out.println(key + ":"+value);
		}

	}

}
