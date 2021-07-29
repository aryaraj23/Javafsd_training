package com.ust.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionExample4 {

	public static void main(String[] args) {
		
		List list = Arrays.asList("One Two three four Five Six one three four".split(" "));
		System.out.println("List: "+list);
		
		List subList = Arrays.asList("three four".split(" "));
		System.out.println("SubList: "+subList);
		System.out.println("indexOfSubList: "+Collections.indexOfSubList(list, subList));
		System.out.println("LastIndexOfSubList: "+Collections.lastIndexOfSubList(list, subList));

	}

}
