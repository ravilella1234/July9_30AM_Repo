package com.icici.loans.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumaratorDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v);
		
		Enumeration<Integer> var = v.elements();
		while(var.hasMoreElements())
		{
			Integer val = var.nextElement();
			if(val%2==0)
				System.out.println(val);
		}
		System.out.println(v);
	}

}
