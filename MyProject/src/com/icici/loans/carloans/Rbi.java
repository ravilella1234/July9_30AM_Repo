package com.icici.loans.carloans;

public interface Rbi 
{
	void withdrawl(); // abstract Method
	void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i1 = new Rbi();
		
		Rbi i;
		
		i=new Icici();
		i.deposit();
		i.withdrawl();
		
		i=new Hdfc();
		i.deposit();
		i.withdrawl();
	}
}
