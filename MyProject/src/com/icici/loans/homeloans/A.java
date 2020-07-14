package com.icici.loans.homeloans;


public  class A
{
	public void m1()
	{
		System.out.println("iam m1 from A");
	}
	
		
	public static void main(String[] args) 
	{
		A a  = new A();
		a.m1();
		
		A o1;
		
		o1 = new C1();
		o1.m1();
		
		o1 = new C2();
		o1.m1();
	}
	
}





