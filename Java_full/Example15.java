package com.ust.examples;

public class Example15 {

	public static void main(String[] args) {
		int[] numbers = {2, -2, 4, 6, -6, 8};
		int sum = 0;
		double avg;
		
		//access all element using for each loop
		//add each element in sum
		
		for(int number:numbers) {
			sum += number;
		}
		
		//get the total number of elemenets
		int arrayLength = numbers.length;
		
		//calculate the average
		
		//convert the average from int to double
		avg = ((double)sum / (double)arrayLength);
		
		System.out.println("Sum= " + sum);
		System.out.println("Average = " + avg);
	}

}
