package com.ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class EnumDemo {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		
		Hashtable<String, String> hashtable = new Hashtable<String,String>();
		
		hashtable.put("Key1","Chaintanya");
		hashtable.put("Key2","Christ");
		hashtable.put("Key3","Peter");
		hashtable.put("Key4","Mona");
		hashtable.put("Key5","Rona");
		
		names = hashtable.keys();
		while(names.hasMoreElements()) {
			key = (String) names.nextElement();
			System.out.println("Key: "+key+"\s& values: "+hashtable.get(key));
		}
		
		

	}

}
