package com.icici.loans.homeloans;

public class StringOperations 
{

	public static void main(String[] args) 
	{
		String s1 = "Ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.hashCode());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.substring(2, 7));
		System.out.println(s1.replace('r', 'v'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		String s2 = new String("ravikan");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.toLowerCase().contains(s2));
		
		System.out.println(s1 + s2); 
		System.out.println(s1.concat(s2));
		
		String s3= " ravikanth";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.toLowerCase().equals(s3.trim()));
		
		String s4 = "ravi kanth lella";
		System.out.println(s4);
		String[] s5 = s4.split(" ");
		for(String s : s5)
		{
			System.out.println(s);
		}
		
		for(int i=0;i<s5.length;i++)
		{
			System.out.println(s5[i]);
		}
		
		System.out.println(s4.startsWith("rav"));
		System.out.println(s4.endsWith("ll"));
		
	}

}
