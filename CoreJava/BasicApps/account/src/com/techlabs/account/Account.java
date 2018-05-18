package com.techlabs.account;

public class Account {
	private int accountno;
	private int balance;
	private String name;

	public Account(String name, int accountno, int balance) {
		this.name = name;
		this.accountno = accountno;
		this.balance = balance;
	}

	public void deposit(int balance) {
		this.balance += balance;
		System.out.println(balance + " Deposit ammount in " + name);
	}

	public void withdrawal(int balance) {
		this.balance -= balance;
		System.out.println(" Withdrawal ammount is : " + balance + " from " + name);
	}

	public void checkBalance() {
		if (balance <= 0)
			System.out.println(name + " Your balance is low");
		else
			System.out.println(name + " Your balance is : " + balance);
	}

}
