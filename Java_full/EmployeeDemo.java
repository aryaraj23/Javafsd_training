package com.ust.examples;

interface EmpNew {
	int eid = 1001;
	void geteid();
}

class ImplClass implements EmpNew {
	public void geteid() {
		System.out.println("Employee id: "+eid);
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		ImplClass ic = new ImplClass();
		ic.geteid();
	}
}
