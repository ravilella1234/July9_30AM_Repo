package com.icici.loans.carloans;

public abstract class FirstAbstract 
{
	int x= 100;
	
	public void m1()
	{
		System.out.println("iam m1 concrete from FirstAbstarct....");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
		//FirstAbstract obj = new FirstAbstract();
		
		FirstAbstract obj ;
		
		obj = new Child();
		obj.m1();
		obj.m2();
	}

}
