package com.ust.examples;

interface FirstInterface {
	public void myMethod();
}

interface SecondInterface {
	public void myMethod2();
}

class DemoInterface implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text..");
	}
	
	public void myMethod2() {
		System.out.println("Second Text...");
	}


 	public static void main(String[] args) {
 		DemoInterface d1 = new DemoInterface();
 		d1.myMethod();
 		d1.myMethod2();
 	}

}