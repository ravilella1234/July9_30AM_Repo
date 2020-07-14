package com.icici.loans.collections;

public class Employee1
{
	private int eNo;
	private String eName;
	
	public Employee1(int eNo, String eName) 
	{
		super();
		this.eNo = eNo;
		this.eName = eName;
	}

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}
	
	
	public void display()
	{
		System.out.println("Emp Id :" +geteNo()  + "    "+ "Emp Name :" + geteName());
	}
	
	
	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(100, "ravilella");
		e1.display();
	}

}
