package com.icici.loans.collections1;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		Hashtable<String, Integer> h  = new Hashtable<String, Integer>();
		h.put("ravilella", 12345);
		h.put("kiran", 234567);
		h.put("sai", 34544556);
		h.put("varun", 2323434);
		h.put("krishna", 3432434);
		
		System.out.println(h.get("sai"));
		
		Set<String> keys = h.keySet();
		for(String i : keys)
		{
			System.out.println(i + " : " + h.get(i));
		}
		
		
		Set<Entry<String, Integer>> values = h.entrySet();
		for( Entry<String, Integer> e : values)
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
