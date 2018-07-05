package com.account.observedp;

public class AccountTest {

	public static void main(String[] args) {	
		EmailListner email=new EmailListner();
		SmsListner sms=new SmsListner();

		
		Account account1=new Account(101,"Ram",10000.0);
		Account account2=new Account(102,"Om",15000.0);
		account1.addListener(email);
		account1.addListener(sms);
		account1.deposit(2000);
		//account1.withdraw(5000);

	}

}
