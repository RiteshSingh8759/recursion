package org.kloc.recursion;
import java.util.Scanner;
public class fibonacciseriesusingformula 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a term that ou want to find fabonacci number = ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			int res=fabonacci(i);
			System.out.println("the fabonacci number of given term"+i+" is = "+res);
		}
		
	}
	static int fabonacci(int n)
	{
		return (int)((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
	}
}
