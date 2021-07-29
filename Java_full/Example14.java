package com.ust.examples;

class TestEmployee {
	int id;
	String name;
	float salary;
	void insert(int i, String n, float s) {
		id = i;
		name = n;
		salary = s;
	}
	void display() {System.out.println(id + ""+name+""+salary);}
	
	public class Example14 {
		
	public static void main(String[] args) {
		TestEmployee e1 = new TestEmployee();
		TestEmployee e2 = new TestEmployee();
		TestEmployee e3 = new TestEmployee();
		
		e1.insert(1001, " Arya ", 25000);
		e2.insert(1002, " Akhila ", 15000);
		e3.insert(1001, " Alona", 35000);
		
		e1.display();
		e2.display();
		e3.display();
	}
	}
}
