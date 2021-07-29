package com.ust.examples;


class Calculation {
	int z;
	
	public void addition(int x, int y) {
		z = x+y;
		System.out.println("The sum of the given numbers:\s"+z);
	}
	
	public void subtraction(int x, int y) {
		z= x - y;
		System.out.println("The difference of the given numbers:\s"+z);
	}
}
public class My_Calculation extends Calculation {
	
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:\s"+z);
	}

	public static void main(String[] args) {
		int a = 50, b=10;
		
		My_Calculation calc = new My_Calculation();
		calc.addition(a, b);
		calc.subtraction(a, b);
		calc.multiplication(a, b);
	}

}
