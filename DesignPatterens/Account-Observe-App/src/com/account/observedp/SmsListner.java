package com.account.observedp;

public class SmsListner implements IAccountListner {

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Sms send to customer.");
		System.out.println(account.getName()+" your  updated balance is :"+account.getBalance());
		
	}

}
