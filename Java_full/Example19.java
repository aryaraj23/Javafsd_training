package com.ust.examples;
/*
 * 
 * to find largest number in an array
 * 
 */
public class Example19 {
	


	public static int largest(int[] array) {
		
		int max = 0;
		
		max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(max < array[i]) max = array[i];
			
		}
		
		return max;
	}
	public static void main(String[] args) {
		System.out.println(largest(new int[] {5,8,3,2}));
	}
}
