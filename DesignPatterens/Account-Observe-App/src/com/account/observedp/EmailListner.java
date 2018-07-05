package com.account.observedp;

public class EmailListner implements IAccountListner {

	@Override
	public void balanceChanged(Account account) {
		System.out.println("Email send to customer.");
		System.out.println(account.getName()+" your  updated balance is :"+account.getBalance());
	}

}
