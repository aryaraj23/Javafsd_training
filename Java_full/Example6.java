package com.ust.examples;

public class Example6 {

	public static void main(String[] args) {
		String[] str = {"alona", "arya", "akhila", "sarmada", "devika"};
		int i=0;
		
		do{
			if(str[i].equals("sarmada"))
				break;
			
			System.out.println(str[i]);
			i++;	

	}while(i<str.length);
	}

}
