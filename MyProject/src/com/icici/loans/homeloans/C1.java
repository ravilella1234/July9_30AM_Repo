package com.icici.loans.homeloans;

public class C1 extends A
{
	public void m1()
	{
		System.out.println("iam overriden m1 from C1");
	}

	public static void main(String[] args) 
	{
		C1 obj = new C1();
		obj.m1();

	}

}
