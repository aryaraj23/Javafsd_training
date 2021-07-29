package com.ust.examples;

public class ArrayExceptionDemo {

	public static void main(String[] args) {
		try {
			int a[] = {2, 6, 4, 8, 1};
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The Specified index does not exist" + "in array. Please correct the error.");
		}

	}

}
