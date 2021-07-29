package com.ust.examples;
/*
 * 
 * example of for loop
 * 
 */
public class Example3 {

	public static void main(String[] args) {
		
		//String[] str = new String[5];
		
		String[] str = {"alona", "arya", "akhila", "sarmada", "devika"};
		
		for(int i=0; i<str.length; i++) {
			
			if(str[i].equals("sarmada"))
			//break;
				continue;
			
			System.out.println(str[i]);
		}
		
	}

}
