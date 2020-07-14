package com.icici.loans.collections;

import java.util.LinkedHashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(10);
		h.add(30);
		h.add(40);
		
		System.out.println(h);

	}

}
