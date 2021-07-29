package com.ust.examples;
/*
 * 
 * Array Average
 * 
 */
public class Example18 {

	public static void main(String[] args) {
		double  array[] = {10, 30, 50, 15};
		
		double sum= 0.0;
		
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {
			sum = sum + array[i];
		}
		
		avg = sum / array.length;
		
		System.out.println("Sum: "+ sum);
		System.out.println("Average: "+ avg);

	}

}
