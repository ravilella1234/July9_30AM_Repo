package com.icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 ="ravikanth";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.isEmpty());
		System.out.println(s1.startsWith("ra"));
		System.out.println(s1.endsWith("nth"));
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println("********************************* \n\n");
		
		String s2 = new String("Ravikan ");
		//System.out.println(s2);
		//System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains(s2.toLowerCase()));
		System.out.println(s1.contains(s2.trim().toLowerCase()));

		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		for(int i=0;i<s1.length();i++)
			System.out.println(s1.charAt(i));
		
		
		System.out.println(s1.replace('r', 'k'));
		
		
		System.out.println(s1.substring(2, 7));
		
		String s3= "ravi";
		String s4 = " ravi ";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s3.equals(s4.trim()));
		
		String s5 = "ravi kanth" ;
		System.out.println(s5);
		String[] sArray = s5.split(" ");
		for(String s:sArray)
		{
			System.out.println(s);
		}
		
	}

}
