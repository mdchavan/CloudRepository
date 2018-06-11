package com.techlas.accounttest;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Sachin", 101, 20000);
		Account account2 = new Account("Ram", 102, 10000);

		int balance = account1.checkBalance();
		System.out.println("Balance is : " + balance);
		account1.deposit(10000);
		System.out.println(" Deposit ammount in ");
		account1.checkBalance();

		int balance1 = account2.checkBalance();
		System.out.println("Balance is : " + balance1);
		try {
			account2.withdrawal(15000);
		} catch (Exception e) {
			System.out.println(" Exception: " + e.getMessage());
		}
		// System.out.println(" Withdrawal ammount is ");
		account2.checkBalance();

		Account account = account1.whoIsRich(account2);
		// System.out.println("Rich account balance of holder is : " +
		// account.getName());

	}

}
