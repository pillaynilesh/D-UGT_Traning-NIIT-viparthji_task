package com.newBank.account.type;

import com.newBank.account.abstracT.AbstractAccount;
import com.newBank.account.enumeration.AccountStatus;
import com.newBank.account.enumeration.AccountType;
import com.newBank.account.exceptions.AccountInactiveException;
import com.newBank.account.exceptions.OverdraftLimitExceededException;

public class CurrentAccount extends AbstractAccount {

	public CurrentAccount(long accNo, float balance, String accountHolderName) {
		super(accNo, balance, accountHolderName);
		// TODO Auto-generated constructor stub
	}

	private float overdraftLimit = 1000;

	AccountStatus accountStatus = AccountStatus.OPEN;

	public float getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(float overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public boolean open() {
		// TODO Auto-generated method stub
		accountStatus = AccountStatus.ACTIVE;
		return true;
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		accountStatus = AccountStatus.CLOSED;
		return true;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		try {
			if (accountStatus.equals(AccountStatus.ACTIVE)) {
				if (balance > amount ) {
					balance = (float) (balance - amount);
				}
				else if (overdraftLimit > amount) {
					overdraftLimit = (float) (overdraftLimit - amount);
				}
				else {
					throw new OverdraftLimitExceededException(
							"You'er Overdraft Limit has Exceeded Sorry we can make this transation !");
				}
			}

			else {
				throw new AccountInactiveException("You'er Account is not Active !");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		return false;
	}

	@Override
	public boolean deopsit(double amount) {
		// TODO Auto-generated method stub
		try {
			if (accountStatus.equals(AccountStatus.ACTIVE)) {
				balance = (float) (balance + amount);
			}
			else {
				throw new AccountInactiveException("You'er Account is not Active !");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		return false;
	}

	@Override
	public AccountType getAccountType() {
		// TODO Auto-generated method stub
		return AccountType.CURRENT;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraftLimit=" + overdraftLimit + ", accountStatus=" + accountStatus + ", accNo="
				+ accNo + ", balance=" + balance + ", accountHolderName=" + accountHolderName + "]";
	}

	
}
