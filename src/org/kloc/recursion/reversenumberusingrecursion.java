package org.kloc.recursion;

import java.util.Scanner;

public class reversenumberusingrecursion {
	static int sum=0;
	static void reverse(int n)
	{
		if(n==0)
		{
			return;
		}
		sum=sum*10+n%10;
		reverse(n/10) ;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number = ");
		int n=sc.nextInt();
		reverse(n);
		System.out.println("the sum of digits is = "+sum);
	}
}
