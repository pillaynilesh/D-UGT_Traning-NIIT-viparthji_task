package com.newBank.account.accountFactory;

import com.newBank.account.enumeration.AccountType;
import com.newBank.account.interfacE.Account;
import com.newBank.account.type.CurrentAccount;
import com.newBank.account.type.SavingAccount;

public class AccountFactory {
	
	public static Account create(String accountHolderName, float initialBalance, AccountType accountType)
	{
		if(accountType.equals(AccountType.SAVING))
		{ 
			long accNo = SavingAccount.getSavingID();
			return new SavingAccount(accNo, initialBalance, accountHolderName);
		}
		else {
			long accNo = CurrentAccount.getCurrenID();
			return new CurrentAccount(accNo, initialBalance, accountHolderName);
		}
		
	}
	
	public AccountFactory()
	{
		
	}

}
