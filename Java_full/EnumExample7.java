package com.ust.examples;

enum Operation {
	PLUS, MINUS, TIMES, DIVIDE;
	
	double calculate(double x, double y) {
		switch(this) {
		case PLUS:
			return x+y;
		case MINUS:
			return x-y;
		case TIMES:
			return x*y;
		case DIVIDE:
			return x/y;
		default:
			throw new AssertionError("Unknown operations" +this);
		}
	}
}
public class EnumExample7 {

	public static void main(String[] args) {
		Operation result = Operation.PLUS;
		System.out.println("PLUS: "+result.calculate(3, 4));
		
		double result1 = Operation.TIMES.calculate(2, 3);
		System.out.println("TIMES: "+result1);
	
	}

}
