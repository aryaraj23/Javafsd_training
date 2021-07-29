package com.ust.examples;
/*
 * 
 * Arrays
 * 
 */
public class Example10 {
	public static void displayArray(int a[] ) {
	
		for(int i : a) {  //anonymous
			System.out.println(i);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		/*int array[] = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		*/
		
		int array[] ={1, 2, 3, 4, 5};
		
		//for(int i=0; i<array.length; i++) {
		//for(int i : array) {  //anonymous
		//	System.out.println(i);
		//}
		displayArray(new int[] {6, 7, 8, 5});
	}
}

