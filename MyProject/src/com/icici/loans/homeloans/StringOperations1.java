package com.icici.loans.homeloans;

public class StringOperations1 
{

	public static void main(String[] args) 
	{
		
		String s1 = new String("ravikanth");
		System.out.println("s1 ---> " + s1.hashCode() + " --- " + s1);
		
		String s2 = new String("lella");
		System.out.println("s2 ---> " + s2.hashCode() + " --- " + s2);
		
		s1 = s1+s2;
		System.out.println("s1 ---> " + s1.hashCode() + " --- " + s1);
		
		System.out.println("----------------------------------------");
		
		
		StringBuffer b1 = new StringBuffer("ravikanth");
		System.out.println("b1 ---> " + b1.hashCode() + " --- " + b1);
		
		StringBuffer b2 = new StringBuffer("lella");
		System.out.println("b2 ---> " + b2.hashCode() + " --- " + b2);
		
		b1= b1.append(b2);
		System.out.println("b1 ---> " + b1.hashCode() + " --- " + b1);
	}

}
