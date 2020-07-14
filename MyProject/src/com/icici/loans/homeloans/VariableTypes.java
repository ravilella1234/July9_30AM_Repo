package com.icici.loans.homeloans;

public class VariableTypes 
{
	//primitive variable
	int x=100;   // instance Variable (or) non-static variable
	static String cname= "vmware";  // static variable
	static VariableTypes obj;
	
	public void m1()
	{
		int x=200;  // local variable
		//System.out.println(y);
		
		System.out.println(this.x);
		System.out.println(cname);
		
	}
	
	public static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);
	}
	

	public static void main(String[] args) 
	{
		obj = new VariableTypes(); // reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);		
	}

}
