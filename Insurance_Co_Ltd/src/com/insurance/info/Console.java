package com.insurance.info;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Viparth.Kumar
 * 
 * Used to read data from users at run time..
 *
 */
public class Console {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static String readLine() {
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	public static float readFloat() {
		return Float.parseFloat(readLine());
	}
	public static double readDouble() {
		return Double.parseDouble(readLine());
	}
	public static int readInt() {
		return Integer.parseInt(readLine());
	}
	public static char readChar() {
		return readLine().charAt(0);
	}
}
