package com.icici.loans.collections;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 
{

	public static void main(String[] args)
	{
		Hashtable<String, Integer> h = new Hashtable<String, Integer>();
		h.put("ravilella", 96762737);
		h.put("sai", 987765653);
		h.put("Teja", 96762737);
		h.put("Varun", 967627537);
		h.put("Kiran", 96862737);
		
		
		
		Set<String> k = h.keySet();
		for(String i:k)
		{
			System.out.println(h.get(i));
		}
		
		Set<Entry<String, Integer>> values = h.entrySet();
		for( Entry<String, Integer> e : values)
		{
			System.out.println(e.getKey() + " ----- " + e.getValue());
		}
	}

}
