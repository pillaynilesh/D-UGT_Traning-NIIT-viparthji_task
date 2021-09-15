package com.newBank.account.type;

import com.newBank.account.abstracT.AbstractAccount;
import com.newBank.account.enumeration.AccountStatus;
import com.newBank.account.enumeration.AccountType;
import com.newBank.account.exceptions.AccountInactiveException;
import com.newBank.account.exceptions.InsufficientBalanceException;

public class SavingAccount extends AbstractAccount {

	public SavingAccount(long accNo, float balance, String accountHolderName) {
		super(accNo, balance, accountHolderName);
		// TODO Auto-generated constructor stub
	}

	private float minimumBalance = 100;

	AccountStatus accountStatus = AccountStatus.OPEN;

	public float getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
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
				if (balance > amount) {
					balance = (float) (balance - amount);
				} else {
					throw new InsufficientBalanceException("You'er Balance is insufficient to make this transation !");
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
			} else {
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
		return AccountType.SAVING;
	}

	@Override
	public String toString() {
		return "SavingAccount [minimumBalance=" + minimumBalance + ", accountStatus=" + accountStatus + ", accNo="
				+ accNo + ", balance=" + balance + ", accountHolderName=" + accountHolderName + "]";
	}

}
