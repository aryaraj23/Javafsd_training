package com.ust.examples;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet Example
 */
public class CollectionExample8 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("mango");
		ts.add("banana");
		ts.add("orange");
		ts.add("grapes");
		ts.add("apple");

		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	} 
	}


