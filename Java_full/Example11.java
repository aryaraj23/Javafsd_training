package com.ust.examples;

import java.io.File;
import java.io.IOException;

/*
 * 
 * File operations
 * 
 */
public class Example11 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ustjava04\\Sample.txt");
		if(f.createNewFile()) {
			System.out.println("New file is created");
		}else {
			System.out.println("File already exist.");
		}

	}

}
