package com.ust.examples;

abstract class Emp {
	private String name;
	private int paymentHour;
	
	void display() {
		System.out.println("Name:\s" + name+ " " + "Payment per Hours:\s"+paymentHour);
	}
	public Emp(String name, int paymentHour) {
		this.name = name;
		this.paymentHour = paymentHour;
		
	}


public abstract int calculateSalary();

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPaymentHour() {
	return paymentHour;
}

public void setPaymentPerHour(int paymentHour) {
	this.paymentHour = paymentHour;
	}
}

class SeniorEmployee extends Emp {
	private int workingHours;
	public SeniorEmployee(String name, int paymentHour, int workingHours) {
		super(name, paymentHour);
		this.workingHours = workingHours;
		
		
	}
	
	public int calculateSalary() {
		return getPaymentHour() * workingHours;
	}
	void display () {
		super.display();
		System.out.println("Working Hours:\s"+workingHours);
		
	}
}	
public class MainEmployee {

	public static void main(String[] args) {
		Emp e1 = new SeniorEmployee("Staff1",1000,10);
		e1.display();
		System.out.println(e1.calculateSalary());

	}

}

