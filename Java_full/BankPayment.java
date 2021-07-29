package com.ust.examples;

class CreditCards{
	private String cardName;
	private int expiryDate;
	private float creditBalance;
	
	CreditCards(){
		cardName = "Arya";
		expiryDate = 25-12-2024;
		creditBalance = 60000;
	}
	
	void checkcardBalance() {
		if(creditBalance >= 40000) {
			System.out.println("Sufficient Balance");
		}else {
			System.out.println("Not much!");
		}
	}
	
	void makePayment(){
		
	}
}

class Visa extends CreditCards{
	float interestRate;
	float creditLimit;
	
	Visa(){
		super();
	}
	
	void checkDiscounts() {
		System.out.println("Many discount will be provided.");
	}
}

class MasterCard extends CreditCards{
	void checkPaymentOptions() {
		System.out.println("Online payment mode is available");
	}
}
public class BankPayment {

	public static void main(String[] args) {
		Visa v = new Visa();
		v.checkcardBalance();
		

	}

}
