package com.ust.examples;

import java.io.File;

public class FileExample3 {

	public static void main(String[] args) {
		
		File f = new File("D:output.txt");
		
		try {
			f.createNewFile();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		File newFile = new File("D:newName.txt");
		
		boolean value = f.renameTo(newFile);
		
		if(value) {
			System.out.println("The name of the file is changed");
		}else {
			System.out.println("The name cannot be changed");
		}

	}

}
