package com.bank.account;

import com.account.exceptions.InsuffientFundsException;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(String accNm, double accBal, double creditLimit) {
		super(accNm, accBal, creditLimit);
		
	}

	@Override
	public void withdraw(double amount) throws InsuffientFundsException {
		if(accBal<amount)
		{
			if((accBal+creditLimit)>=amount)
			{
				accBal=(accBal+creditLimit)-amount;
			}
			else
			{
				throw new InsuffientFundsException("Insuffient Balance");
			}
		}
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", accBal="
				+ accBal + ", toString()=" + super.toString() + ", getAccNm()="
				+ getAccNm() + ", getAccNo()=" + getAccNo() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

}
