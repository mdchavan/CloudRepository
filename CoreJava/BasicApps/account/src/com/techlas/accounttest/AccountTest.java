package com.techlas.accounttest;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Sachin", 101, 20000);
		Account account2 = new Account("Ram", 102, 10000);

		account1.checkBalance();
		account1.deposit(10000);
		account1.checkBalance();

		account2.checkBalance();
		account2.withdrawal(5000);
		account2.checkBalance();

	}

}
