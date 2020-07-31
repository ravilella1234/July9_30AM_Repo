package com.icici.loans.homeloans;

public class B extends A // IsA Relationship
{
	public void m2()
	{
		System.out.println("iam m2 from B");
	}
	
	public void m1()
	{
		System.out.println("iam overriden m1 from B");
	}
	
	public static void main(String[] args) 
	{
		A a = new A();  // HasA relationship
		a.m1();
		
		B b = new B();
		b.m1();
		b.m2();
		
		A  obj = new B();
		obj.m1();
		
	}

}
