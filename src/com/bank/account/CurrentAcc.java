package com.bank.account;

import com.account.exceptions.InsuffientFundsException;

public abstract class CurrentAcc extends BankAccount{
	
public final double  creditLimit;
public CurrentAcc(String accNm, double accBal,double creditLimit) {
	super(accNm, accBal);
	this.creditLimit=creditLimit;
	
}
@Override
public abstract void withdraw(double amount) throws InsuffientFundsException;

@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNm()="
			+ getAccNm() + ", getAccNo()=" + getAccNo() + ", getAccBal()="
			+ getAccBal() + ", toString()=" + super.toString()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}



}
