package com.bank.account;

public class MMBankFactory extends BankFactory{
	private MMSavingAcc savingAccountCustomer;
	private MMCurrentAcc currentAccountCustomer;
	@Override
	public MMSavingAcc getNewSavingAcc(String accNm, double accBal,
			boolean isSalaried) {
		savingAccountCustomer=new MMSavingAcc(accNm,accBal,isSalaried);
		return  savingAccountCustomer;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(String accNm, double accBal,
			double creditLimit) {
		currentAccountCustomer=new 	MMCurrentAcc(accNm,accBal,creditLimit);
		return currentAccountCustomer;
	}

}
