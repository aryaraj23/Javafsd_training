package com.ust.examples;

//parent class ---> BankDetails
class BankDetails{
	String name;
	int id;
	
	void show() {
		System.out.println(name +"\n"+id);
	}
}

class Employee1 extends BankDetails {
	String eName;
	int eid;
	
	void show() {
		System.out.println(name +"\n"+id +"\n" +eName+"\n" +eid);
	}
	
}

class Employee2 extends BankDetails {
	String eName;
	int eid;
	
	void show() {
		System.out.println(name +"\n"+id +"\n" +eName+"\n" +eid);
	}
	
}
public class Example28 {

	public static void main(String[] args) {
		BankDetails b = new BankDetails();
		Employee1 e1 = new Employee1();
		Employee2 e2 = new Employee2();
		b.name = "federal";
		b.id = 1001;
		
		e1.eName = "Arya";
		e1.eid = 101;

		e2.eName = "Aishwarya";
		e2.eid = 102;
		
		System.out.println(b.name+"\n"+b.id+"\n\n"+e1.eName+"\n"+e1.eid+"\n\n"+e2.eName+"\n"+e2.eid);

	}

}
