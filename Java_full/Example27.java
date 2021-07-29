package com.ust.examples;

class Bank {
	private int accountNo;
	private String accountName;
	private	float accountBalance;


	void printbankDetails() {
		System.out.println(accountNo + "\n" +accountName + "\n" +accountBalance);
	}
	
	protected void insertBankdata(int x, String y, float z) {
	
		accountNo = x;
		accountName = y;
		accountBalance = z;
	}
}
class Example27{
	

	public static void main(String[] args) {
		Bank e1 = new Bank();
		e1.insertBankdata(123,"arya",10000.0f);
		e1.printbankDetails();

	}

}
