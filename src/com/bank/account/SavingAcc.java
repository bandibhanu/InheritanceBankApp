package com.bank.account;

import com.account.exceptions.InvalidAmountException;

public abstract  class SavingAcc extends BankAccount{

private boolean isSalary;
private final static double MINBAL=50;
public SavingAcc(String accNm, double accBal,boolean isSalary) {
	super(accNm, accBal);
		this.isSalary=isSalary;
}

@Override
public String toString() {
	return "SavingAcc [isSalary=" + isSalary + ", getAccNm()=" + getAccNm()
			+ ", getAccNo()=" + getAccNo() + ", getAccBal()=" + getAccBal()
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

@Override
public  abstract void withdraw(double amount) throws InvalidAmountException;

}
