package com.ust.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionDemo {
	public static void findFile() throws IOException {
		File newFile = new File("C:\\Users\\ustjava04\\test.txt");
		FileInputStream stream = new FileInputStream(newFile);
				
	}
	public static void main(String[] args) {
		try {
			findFile();
		}catch (IOException e) {
			System.out.println(e);
		}

	}

}
