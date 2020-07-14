package com.icici.loans.collections;

public class SettersAndGettersDemo 
{
	private int eno=100;
	private String ename="kiran";
	private float sal=34.34f;
	
	
	public int getEno() {
		return eno;
	}

	public String getEname() {
		return ename;
	}

	public float getSal() {
		return sal;
	}


	public static void main(String[] args) 
	{
		SettersAndGettersDemo obj = new SettersAndGettersDemo();
		System.out.println(obj.eno);
		System.out.println(obj.ename);
		System.out.println(obj.sal);
	}

}
