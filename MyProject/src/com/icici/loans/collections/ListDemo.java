package com.icici.loans.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object>  a  = new ArrayList<>();
		a.add(10);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(20);

		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.indexOf("ravilella"));
		System.out.println(a.hashCode());
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.add(30);
		System.out.println(a);
		
		a.add(1, "sai");
		System.out.println(a);
		
		a.set(1, "keerthan");
		System.out.println(a);
		
		System.out.println(a.contains("kanth"));
		
		
		
		System.out.println(a.subList(1, 4));
		
		a.remove(1);
		System.out.println(a);
		
		a.remove("ravilella");
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
		
		
		System.out.println("-----------------------------------------------");
		
		for(Object i : a)
		{
			System.out.println(i);
		}
		
		for(int j=0;j<a.size();j++)
		{
			System.out.println(a.get(j));
		}
	}

}
