package com.ust.examples;

import java.net.MalformedURLException;
import java.net.URL;

public class MyTryBlockOnly {
	

	public static void main(String[] args) throws MalformedURLException {
		try {
			URL url = new URL("https://www.google.com");
		}finally {
			System.out.println("In finally block");
		}
	}

}
