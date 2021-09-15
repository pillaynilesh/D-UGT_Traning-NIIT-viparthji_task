package com.newBank.account.exceptions;

public class AccountInactiveException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountInactiveException (String str)
	{
		//"You'er Account is not Active !"
		super(str);
		//System.err.println(str);
	}

}
