package com.account.observedp;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	List<IAccountListner> accountHolders;
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	

	public Account(int accountNumber,String name,Double balance){
		accountHolders=new ArrayList<IAccountListner>();
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	
	public void addListener(IAccountListner iaccount){
		accountHolders.add(iaccount);
	}
	public void removeListner(IAccountListner iaccount){
		accountHolders.remove(iaccount);
	}
	
	public void withdraw(int ammount){
		balance=balance-ammount;
		update();
		
	}

	public void deposit(int ammount){
		balance=balance+ammount;
		update();
	}
	
	public void update(){
		for(IAccountListner accountHolder :accountHolders){
			accountHolder.balanceChanged(this);
		}
	}
}