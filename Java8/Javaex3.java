package com.ust.lamdaex;

@FunctionalInterface
interface MyInterface{

    // abstract method
    double getPiValue();
}

public class Javaex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ref;
	    
	    // lambda expression
	    ref = () -> 3.1415;
	    
	    System.out.println("Value of Pi = " + ref.getPiValue());


	}

}
