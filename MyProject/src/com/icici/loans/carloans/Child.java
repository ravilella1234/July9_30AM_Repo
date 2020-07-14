package com.icici.loans.carloans;

public class Child extends FirstAbstract
{

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.m1();
		c.m2();
	}
	
	public void m1()
	{
		System.out.println("iam m1 overriden from Child Class....");
	}

	@Override
	public void m2() 
	{
		System.out.println("iam m2 overriden from child class");
	}

}
