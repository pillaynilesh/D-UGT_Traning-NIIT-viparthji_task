package com.newBank.account.interfacE;

public interface Account {

	public boolean open();

	public boolean close();

	public boolean withdraw(double amount);

	public boolean deopsit(double amount);
}
