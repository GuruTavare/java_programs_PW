package com.prowings.OOPs.Encapsulation;

public class TestBank {

	public static void main(String[] args) {
		
		
		BankDetails b1 = new BankDetails("Ram", 0);
		BankDetails b2 = new BankDetails("Sham", 10000);
		BankDetails b3 = new BankDetails("Shri", 10000);
		
		b1.setBankBalance(0);
		b1.removeBankBalance(20000);
		
		b1.displayBankEmployeeDetails();
		b2.displayBankEmployeeDetails();
		b3.displayBankEmployeeDetails();
		
		BankDetails[] emp = {b1,b2,b3};
		
		double totalfund = BankDetails.totalBankFund(emp);
		
		System.out.println("Total fund present in Bank is: "+totalfund);
	}

}
