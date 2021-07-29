package com.ust.examples;

public class OuterClass {
	private void getValue() {
		int sum = 20;
		
		//local inner class method inside method
		class Inner{
			public int divisor;
			public int remainder;
			
			public Inner() {
				divisor = 4;
				remainder = sum % divisor;
			}
			private int getDivisor() {
				return divisor;
			}
			private int getRemainder() {
				return sum % divisor;
			}
			private int getQuotient() {
				System.out.println("Inside Inner class");
				return sum/divisor;
			}
		}
		Inner in1 = new Inner();
		System.out.println("Divisor =\s"+in1.getDivisor());
		System.out.println("Remainder =\s"+in1.getDivisor());
		System.out.println("Quotient =\s"+in1.getDivisor());
	}

	public static void main(String[] args) {
		OuterClass ou = new OuterClass();
		ou.getValue();

	}

}
