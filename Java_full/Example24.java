package com.ust.examples;

public class Example24 {
	String name;
	int id;
	
	Example24(String name, int id){
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		Example24 Student1 = new Example24("Joe", 101);
		System.out.println("Student Name:" +Student1.name+" "+"Student id:"+ " "+Student1.id);
	}

}
