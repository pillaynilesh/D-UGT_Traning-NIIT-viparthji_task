package com.newBank.account.abstracT;

import com.newBank.account.IdGenerator.IdGenerator;
import com.newBank.account.enumeration.AccountType;
import com.newBank.account.interfacE.Account;

public abstract class AbstractAccount extends IdGenerator implements Account{
	protected long accNo;
	protected float balance;
	protected String accountHolderName;

	public abstract AccountType getAccountType();

	public AbstractAccount(long accNo, float balance, String accountHolderName) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}
	
	

}
