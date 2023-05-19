package org.kloc.recursion;

import java.util.Scanner;

public class factorialusingrecursion 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to ehom you find factorial = ");
		Long n=sc.nextLong();
//		int res= facto(n);
//		System.out.println("the factorial of given number is = "+res);
		Long prod=1l;
	     while(n!=1){prod*=n;n--;}
	     System.out.println("the factorial of given number is = "+prod);
		
	}
	static int facto(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*facto(n-1);
	}
}
