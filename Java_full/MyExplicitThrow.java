package com.ust.examples;

public class MyExplicitThrow {

	public static void main(String[] args) {
		try {
			MyExplicitThrow met = new MyExplicitThrow();
			System.out.println("length of JUNK is:\s"+met.getStringSize("JUNK"));
			System.out.println("length of WRONG is:\s"+met.getStringSize("WRONG"));
			System.out.println("length of null string is:\s"+met.getStringSize(null));
		}catch(Exception e) {
			System.out.println("Exception message: "+e.getMessage());
		}

	}
	public int getStringSize(String str) throws Exception {
		if(str == null) {
			throw new Exception("String input is null");
		}
		return str.length();
	}

}
