package com.icici.loans.homeloans;

public class ArrayofObjects 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student(101, "ravilella");
		Student s2 = new Student(102, "sai");
		Student s3 = new Student(103, "keerthan");
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		
		Student[] s = new Student[3];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		
		for(Student i : s)
		{
			System.out.println(i);
		}
		

	}

}


class Student
{
	int sno;
	String sname;
	
	public Student(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() 
	{
		return "Student [sno=" + sno + ", sname=" + sname + "]";
	}
	
	
	

}
