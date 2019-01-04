package com.bank.account;

import com.account.exceptions.InsuffientFundsException;
import com.account.exceptions.InvalidAmountException;

public abstract class BankAccount {
	private final int accNo;
	private String accNm;
	protected double accBal;
	private static int accGenerator;
	static{
		accGenerator=100;
	}
	{
		accNo=++accGenerator;
	}
	public BankAccount( String accNm, double accBal) {
		super();
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public int getAccNo() {
		return accNo;
	}
	public double getAccBal() {
		return accBal;
	}
	public abstract void withdraw(double amount) throws InvalidAmountException, InsuffientFundsException;

	public void deposite(double amount)
	{
		accBal=accBal+amount;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", accNm=" + accNm + ", accBal="
				+ accBal + "]";
	}
	
		
	
	

}
