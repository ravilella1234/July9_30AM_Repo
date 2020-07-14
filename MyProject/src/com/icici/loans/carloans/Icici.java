package com.icici.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i= new Icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl in ICICi");
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit in ICICi");
	}

}
