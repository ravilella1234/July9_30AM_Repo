package com.icici.loans.homeloans;

public class TwoDimensionArray 
{

	public static void main(String[] args) 
	{
		//int[] x = {10,20,30};
		//int[] y = new int[4];
		
		
		
		int[][] p = {
						{1,2,3,4},
						{5,6,7},
						{9,10,11,12,13}
					};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j] + "  ");
			}
			System.out.println(" ");
		}
		
		
		for(int k[] : p)
		{
			for(int l : k)
			{
				System.out.print(l + "  ");
			}
			System.out.println();
		}
		
	}

}
