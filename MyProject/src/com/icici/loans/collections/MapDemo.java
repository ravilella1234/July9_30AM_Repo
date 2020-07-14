package com.icici.loans.collections;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args)
	{
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(100, 100);
		h.put(120, 200);
		h.put(1, 300);
		h.put(300, 200);
		h.put(40, 400);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.hashCode());
		System.out.println(h.get(30));
		
		Set<Integer> k = h.keySet();
		for(Integer i:k)
		{
			System.out.println(h.get(i));
		}
	}

}
