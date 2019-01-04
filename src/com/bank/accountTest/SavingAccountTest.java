package com.bank.accountTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.account.exceptions.InvalidAmountException;
import com.bank.account.BankFactory;
import com.bank.account.CurrentAcc;
import com.bank.account.MMBankFactory;
import com.bank.account.SavingAcc;

public class SavingAccountTest {
	private BankFactory bankFactory;
	private SavingAcc savingAccountCustomer;
	private CurrentAcc currentAccountCustomer;
	
	@Test
	public void setUp() throws InvalidAmountException
	{
		bankFactory=new MMBankFactory();// instance of MMBankFactory to BankFactory reference
		savingAccountCustomer =bankFactory.getNewSavingAcc("Bhanu", 9000, true);
		currentAccountCustomer=bankFactory.getNewCurrentAcc("shabzan", 6000, 100);
		savingAccountCustomer.withdraw(500.0);
		System.out.println(savingAccountCustomer);
		String expected="MMSavingAcc [toString()=SavingAcc [isSalary=true, getAccNm()=Bhanu, getAccNo()=101, getAccBal()=8500.0, toString()=BankAccount [accNo=101, accNm=Bhanu, accBal=8500.0], getClass()=class com.bank.account.MMSavingAcc, hashCode()=1560911714], getAccNm()=Bhanu, getAccNo()=101, getAccBal()=8500.0, getClass()=class com.bank.account.MMSavingAcc, hashCode()=1560911714]";
	assertEquals(expected, savingAccountCustomer.toString());
		
	}

	

}
