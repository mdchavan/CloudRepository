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

	public String getName() {
		return this.name;
	}

	public void deposit(int balance) {
		this.balance += balance;
	}

	public void withdrawal(int balance) {
		this.balance -= balance;

	}

	public int checkBalance() {
		return balance;
	}

	public Account whoIsRich(Account account) {
		if (balance > account.balance)
			return this;
		else
			return account;

	}

}
