package com.insurance.info;

public class Test {
	
	public String revse(String str)
	{
		String temp="";
		//int num=str.length();
		for(int i=str.length()-1 ;i>=0; i--)
		{
			temp += str.charAt(i);
		}
		return temp;
	}

	public int num()
	{
		int i = 0;
		while (i<101 ) {
			System.out.println(i);
			i++;
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test testObj = new Test();
	//	String str = "Nilesh";
		
		//System.out.println(testObj.revse(str));
		
		//testObj.num();
		int i ;
		System.out.println();

	}

}
