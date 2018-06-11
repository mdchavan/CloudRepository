package com.techlabs.account;

public class InsufficientBalanceException extends RuntimeException {
	String message;

	public InsufficientBalanceException(Account obj) {
		message = "Account holder " + obj.getAccountNo() + " of " + obj.getName() + " insufficient balance";
	}

	public String getMessage() {
		return message;
	}

}
