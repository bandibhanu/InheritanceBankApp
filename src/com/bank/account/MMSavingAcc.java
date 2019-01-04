package com.bank.account;

import com.account.exceptions.InvalidAmountException;

public class MMSavingAcc extends SavingAcc{
	private static final double MINBAL=50;

	public MMSavingAcc(String accNm, double accBal, boolean isSalary) {
		super(accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) throws InvalidAmountException {
		if(amount>0)
		{
			accBal=accBal-amount;
		}
		else
		{
			throw new InvalidAmountException("Invalid amount"); 
		}
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccNm()="
				+ getAccNm() + ", getAccNo()=" + getAccNo() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
