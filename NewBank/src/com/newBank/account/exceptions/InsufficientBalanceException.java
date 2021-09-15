package com.newBank.account.exceptions;

public class InsufficientBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String str) {
		// "You'er Balance is insufficient to make this transation !"
		super(str);
		//System.err.println(str);
	}
	

}
