package org.kloc.recursion;

import java.util.Scanner;

public class patternUsingRecursion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row =");
		int r=sc.nextInt();
		int c=0;
		printPattern(r,c);
	}
	static void printPattern(int r,int c)
	{
		if(r==0) {return;}
		if(c<r)
		{
			
			printPattern(r, c+1);
		}else 
		{
			System.out.print("*");
			System.out.println();
			printPattern(r-1, 0);
		}
	}
}
