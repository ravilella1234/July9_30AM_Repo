package com.icici.loans.homeloans;

public class StringDemo1 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s2 = "lella";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		s1 = s1+s2;
		//s1= s1.concat(s2);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println("-----------------------------------------");
		
		
		StringBuffer b1 =new StringBuffer("ravi");
		System.out.println(b1);
		System.out.println(b1.hashCode());
		
		
		StringBuffer b2 = new StringBuffer("kanth");
		System.out.println(b2);
		System.out.println(b2.hashCode());
		
		b1=b1.append(s2);
		System.out.println(b1);
		System.out.println(b1.hashCode());
		

	}

}
