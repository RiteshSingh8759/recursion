package org.kloc.recursion;

import java.util.Scanner;

public class snailProgram {
 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the row length =");
		int row=sc.nextInt();
		System.out.print("enter the column length =");
		int column=sc.nextInt();
		int[][] ar=new int[row][column];
		System.out.println("enter the matrix elements= ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("these are the element in spiral order =");
		for(int i=0,j=ar[0].length-1;i<ar.length&&j>=0;i++,j--)
		{
			
			for(int k=i;k<j;k++)
			{
				System.out.print(ar[i][k]+" ");
			}
			for(int k=i;k<j;k++)
			{
				System.out.print(ar[k][j]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(ar[j][k]+" ");
			}
			for(int k=j;k>i;k--)
			{
				System.out.print(ar[k][i]+" ");
			}
		}
		if(ar.length%2!=0&&ar[0].length%2!=0)
		{
			System.out.print(ar[ar.length/2][ar[0].length/2]+" ");
		}

	}

}
