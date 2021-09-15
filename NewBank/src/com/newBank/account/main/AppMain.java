package com.newBank.account.main;

import com.newBank.account.accountFactory.AccountFactory;
import com.newBank.account.enumeration.AccountType;
import com.newBank.account.interfacE.Account;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account savingAccoount = AccountFactory.create("Soham", 100, AccountType.SAVING);

		savingAccoount.open();
		
		System.out.println(savingAccoount.toString());
		System.out.println("-------------------------------------");
		
		savingAccoount.close();
		
		savingAccoount.deopsit(100);
		
		//System.out.println(savingAccoount.toString());
		//System.out.println("-------------------------------------");
		
		savingAccoount.withdraw(160);
		
		System.out.println(savingAccoount.toString());
		System.out.println("-------------------------------------");
		
		System.out.println();
		
		// System.out.println("Hello");
		
		Account currentAccount = AccountFactory.create("ABC", 100, AccountType.CURRENT);
		
		currentAccount.open();
		
		System.out.println(currentAccount.toString());
		/*
		Account currentAccount2 = AccountFactory.create("haha", 100, AccountType.CURRENT);
		
		currentAccount2.open();
		
		System.out.println(currentAccount2.toString());
		*/
		
		currentAccount.withdraw(50);
		currentAccount.withdraw(400);
		
		System.out.println(currentAccount.toString());
		
		currentAccount.deopsit(105.07);
		System.out.println(currentAccount.toString());
		
		currentAccount.close();
		
		
	}

}
