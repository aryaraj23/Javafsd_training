package com.ust.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample5 {

	public static void main(String[] args) {
		File file = new File("D:file1.txt");
		
		FileWriter fileWrite = null;
		BufferedWriter bufferWrite = null;
		
		try {
			fileWrite = new FileWriter(file);
			bufferWrite = new BufferedWriter(fileWrite);
			bufferWrite.write("Example1 \n");
			bufferWrite.write("of using BufferedWriter and \n");
			bufferWrite.write("BufferedReader.");
			bufferWrite.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fileWrite!=null) {
					fileWrite.close();
				}
				if(bufferWrite != null) {
					bufferWrite.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		FileReader fileRead = null;
		BufferedReader bufferRead = null;
		
		try {
			fileRead = new FileReader(file);
			bufferRead = new BufferedReader(fileRead);
			String line = null;
			
			while((line = bufferRead.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fileRead != null) {
					fileRead.close();
				}
				if(fileRead!=null) {
					bufferRead.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
