package com.ust.examples;

import java.io.FileInputStream;
//import java.io.FileOutputStream;

public class FileExample1 {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("C:\\Users\\ustjava04\\Sample.txt");
			
			System.out.println("Data in the file:\s");
			
			int i = input.read();
			
			while(i!=-1) {
				System.out.print((char) i);
				
				i = input.read();		
			}
			input.close();
			
			/*String s ="output file";
			FileOutputStream output = new FileOutputStream("D:output.txt");
			
			output.write(s.getBytes());
			output.close();*/
		}
		catch(Exception e) {
			e.getStackTrace();
			}
		
	}

}
