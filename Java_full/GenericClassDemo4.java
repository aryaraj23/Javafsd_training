package com.ust.examples;

import java.util.ArrayList;
import java.util.List;

public class GenericClassDemo4 {

	public static void main(String[] args) {
		List<Integer> int1 = new ArrayList<>();
		int1.add(3);
		int1.add(6);
		int1.add(9);
		
		double sum = sum(int1);
		System.out.println("Sum of ints="+sum);
		
	}

	private static double sum(List<? extends Number> list) {
		double sum =0;
		for(Number n :list) {
			sum += n.doubleValue();
		}
		return sum;
	}

}
