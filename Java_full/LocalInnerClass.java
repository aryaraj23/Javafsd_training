package com.ust.examples;

public class LocalInnerClass {
	
	void outerMethod() {
		System.out.println("Inside OuterMethod");
		//Inner class is local to OuterMethod()
		
		class InnerNew {
			void innerMethod() {
				System.out.println("Inside InnerMethod");
			}
		}
		InnerNew y = new InnerNew();
		y.innerMethod();
	}
	
	public static void main(String[] args) {
		LocalInnerClass outer = new LocalInnerClass();
		outer.outerMethod();

	}

}
