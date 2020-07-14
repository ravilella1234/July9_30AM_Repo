package com.icici.loans.homeloans;

public class C2 extends A
{
	public void m1()
	{
		System.out.println("iam overriden m1 from C2");
	}

	public static void main(String[] args) 
	{
		C2 obj = new C2();
		obj.m1();
	}

}
