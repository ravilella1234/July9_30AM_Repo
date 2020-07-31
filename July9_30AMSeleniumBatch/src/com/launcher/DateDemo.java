package com.launcher;

import java.util.Date;

public class DateDemo 
{

	public static void main(String[] args) 
	{
		Date dt = new Date();
		System.out.println(dt);
		String d = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(d);
	}

}
