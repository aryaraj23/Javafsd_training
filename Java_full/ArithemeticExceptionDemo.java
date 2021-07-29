package com.ust.examples;

public class ArithemeticExceptionDemo {

	public static void main(String[] args) {
		try {
			int dividedByZero = 5/0;
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception ae= "+ae.getMessage());
		}finally {
			System.out.println("This is the finally blocks");
		}

	}

}
