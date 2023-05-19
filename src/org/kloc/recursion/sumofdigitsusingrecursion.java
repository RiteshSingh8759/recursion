package org.kloc.recursion;

import java.util.Scanner;

public class sumofdigitsusingrecursion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number = ");
		int n=sc.nextInt();
		int res=sumofdigits(n);
		System.out.println("the sum of digits is = "+res);
		sc.close();
	}
	static int sumofdigits(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n%10+sumofdigits(n/10);
		
	}

}
