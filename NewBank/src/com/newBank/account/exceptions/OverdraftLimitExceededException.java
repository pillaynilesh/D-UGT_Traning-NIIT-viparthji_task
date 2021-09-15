package com.newBank.account.exceptions;

public class OverdraftLimitExceededException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OverdraftLimitExceededException(String str) {
		// "You'er Overdraft Limit has Exceeded Sorry we can make this transation !"
		super(str);
		//System.err.println(str);
	}

}
