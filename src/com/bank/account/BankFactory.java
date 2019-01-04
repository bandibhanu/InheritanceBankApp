package com.bank.account;

public abstract class BankFactory {

	public abstract MMSavingAcc getNewSavingAcc( String accNm, double accBal, boolean isSalaried);
	
	public abstract MMCurrentAcc getNewCurrentAcc(String accNm, double accBal, double creditLimit);
}
