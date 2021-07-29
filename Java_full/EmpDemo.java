package com.ust.examples;

interface Emp1{
	int eid = 1002;
	void geteid();
}

public class EmpDemo {

	public static void main(String[] args) {
		Emp1 e1 = new Emp1() {
			
			public void geteid(){
				System.out.println("Employee id: "+eid);
			}
		};
		e1.geteid();

	}

}
