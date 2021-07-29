package com.ust.examples;

public class Configure {
	final static String Name = "CONFIG";
	final long initTime;
	Configure() {
		this.initTime = System.currentTimeMillis();
	}

	public static void main(String[] args) {
		Configure cg1 = new Configure();
		System.out.println(cg1.initTime);
		
		Configure cg2 = new Configure();
		System.out.println(cg2.initTime);

	}

}
