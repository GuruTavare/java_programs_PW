package com.prowings.OOPs.Encapsulation;

public class BankDetails {
	private String name;
	private double bankBalance;

	public BankDetails(String name, double bankBalance) {
		super();
		this.name = name;
		this.bankBalance = bankBalance;
	}

	public void setBankBalance(double bankBalance) {
		this.bankBalance += bankBalance;
	}

	public void removeBankBalance(double bankBalance) {
		if (this.bankBalance >= 500)
			this.bankBalance -= bankBalance;
		else

			System.out.println("Insufficient fund");

	}

	public String getName() {
		return name;
	}

	public double getBankBalance() {
		return bankBalance;
	}

	public static double totalBankFund(BankDetails[] emp) {
		double totalBankFund = 0.0;
		for (BankDetails x : emp) {
			totalBankFund += x.getBankBalance();
		}
		return totalBankFund;
	}

	public void displayBankEmployeeDetails() {
		System.out.println("Employee: " + name);
		System.out.println("Bank Balance: " + bankBalance);
	}

}
