package com.ust.examples;

public class NestedInnerClass {

	class Inner1 {
		public void show() {
			System.out.println("In a nested class method");
		}
	}
	public static void main(String[] args) {
		NestedInnerClass.Inner1 in = new NestedInnerClass().new Inner1();
		in.show();

	}

}
