package com.icici.loans.collections1;

public class Emp 
{
	private int eNo=1744;
	private String eName="ravilella";
	private float eSal=1234.34f;

	

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

	public float geteSal() {
		return eSal;
	}

	public void seteSal(float eSal) {
		this.eSal = eSal;
	}




	public static void main(String[] args) 
	{
		Emp e = new Emp();
		System.out.println(e.eNo);
		System.out.println(e.eName);
		System.out.println(e.eSal);

	}

}
