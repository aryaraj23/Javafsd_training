package com.ust.examples;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FileDemo {

	public static void main(String[] args){
		try {
		File f = new File("C:\\Users\\ustjava04\\FileDemo.txt");
		/*if(f.createNewFile()) {
			System.out.println(f.getName()+"is created");
		}else {
			System.out.println("Already Exists");
		}*/
		//f.write("This is a java training");
		
		
		//Scanner read = new Scanner(f);
		FileReader read = new FileReader(f);
		/*while(read.hasNext()) {
			String data =read.nextLine();
			System.out.println(data);
		}*/
		int ch;
		
		while((ch=read.read())!=-1) {
			System.out.print((char) ch);
		}
		read.close();
		
		
		}catch(IOException e) {
			System.out.println("Exception occured");
			
		}
	}

}
