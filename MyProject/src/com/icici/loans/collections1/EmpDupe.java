package com.icici.loans.collections1;

public class EmpDupe extends Emp
{

	public static void main(String[] args) 
	{
		EmpDupe ed = new EmpDupe();
		
		ed.seteNo(1745);
		System.out.println(ed.geteNo());
		
		ed.seteName("sai");
		System.out.println(ed.geteName());
		
		ed.seteSal(12.12f);
		System.out.println(ed.geteSal());
	}

}
