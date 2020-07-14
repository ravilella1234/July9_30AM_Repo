package com.icici.loans.carloans;

public class ThirdClass 
{
	int a=10,b=20,c; // properties
	

	void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is : " + c);
	}
	
	void sub()
	{
		c=a-b;
		System.out.println("Sub of A  & B is : " + c);
	}
	
	public static void main(String[] args)
	{
		ThirdClass obj = new ThirdClass();
		obj.add();
		obj.sub();

		ThirdClass obj1 = new ThirdClass();
		obj1.add();
		obj1.sub();
		
	}

}
