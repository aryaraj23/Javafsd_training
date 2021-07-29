package com.ust.examples;

public class Example5 {

	public static void main(String[] args) {
		String[] str = {"alona", "arya", "akhila", "sarmada", "devika"};
		int i=0;
		
		while(i<str.length) {
			if(str[i].equals("sarmada"))
				break;
			
			System.out.println(str[i]);
			i++;	
		}
		

	}

}
