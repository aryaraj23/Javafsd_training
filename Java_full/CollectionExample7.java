package com.ust.examples;
/*
 * Hash Set Example
 */
import java.util.HashSet;
import java.util.Iterator;


public class CollectionExample7 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("mango");
		hs.add("banana");
		hs.add("orange");
		hs.add("grapes");
		hs.add("apple");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	} 

}
