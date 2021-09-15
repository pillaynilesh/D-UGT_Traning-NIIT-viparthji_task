package com.newBank.account.IdGenerator;

public class IdGenerator {
	private static long savingID = 11111;
	private static long currenID = 21111;


	public static long getSavingID() {
		return savingID++;
	}

	public static long getCurrenID() {
		return currenID++;
	}
}
