package com.icici.loans.homeloans;

public class TwoDimesionArray1 
{

	public static void main(String[] args) 
	{
		int[][] q = new int[3][3];
		
		q[0][0]=10;
		q[0][1]=20;
		q[0][2]=30;
		
		q[1][0]=40;
		q[1][1]=50;
		q[1][2]=60;
		
		q[2][0]=70;
		q[2][1]=80;
		q[2][2]=90;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(q[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		for(int k[] : q)
		{
			for(int l : k)
			{
				System.out.print(l + "  ");
			}
			System.out.println();
		}
		
		

	}

}
