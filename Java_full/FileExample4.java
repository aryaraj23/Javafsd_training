package com.ust.examples;

import java.io.File;

public class FileExample4 {

	public static void main(String[] args) {
		
		File file = new File("D:\\");

		String[] fileList = file.list();
		
		for(String str : fileList) {
			System.out.println(str);
		}
	}

}
