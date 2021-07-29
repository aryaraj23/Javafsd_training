package com.ust.examples;

class BaseDemo {
	final void display(int i) {
		System.out.println(i);
	}
}
class ChildDemo extends BaseDemo {
	
	 void display(int i, String s) {
		System.out.println(i+ " "+s);
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		ChildDemo fd = new ChildDemo();
		fd.display(51,"Hello");
		}
}


