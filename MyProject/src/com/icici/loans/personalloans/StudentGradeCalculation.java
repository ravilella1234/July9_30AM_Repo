package com.icici.loans.personalloans;

import java.util.Scanner;

/* Java Program Example - Calculate Grade of Student */

public class StudentGradeCalculation 
{
	 public static void main(String args[])
	 {
	
		int[] mark = new int[5];
	    float sum=0, avg;
	    Scanner scan = new Scanner(System.in);
		
	    System.out.print("Enter Marks Obtained in 5 Subjects : ");
	    for(int i=0; i<mark.length; i++)
	    {
	        mark[i] = scan.nextInt();
	        sum = sum + mark[i];
	    }
		
	    System.out.println("Sum of 5 subjects : " +sum);
	    
	    avg = sum/5;
	    System.out.println("Average of Subjects is : " +avg);
		
	    System.out.print("Your Grade is ");
	    if(avg>80)
	    {
	        System.out.print("A");
	    }
	    else if(avg>60 && avg<=80)
	    {
	        System.out.print("B");
	    }
	    else if(avg>40 && avg<=60)
	    {
	        System.out.print("C");
	    }
	    else
	    {
	        System.out.print("D");
	    }
	 }
}

