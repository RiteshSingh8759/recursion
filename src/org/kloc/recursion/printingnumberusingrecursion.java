package org.kloc.recursion;

import java.util.Scanner;

public class printingnumberusingrecursion {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number from where you want to rint natural number = ");
		int n=sc.nextInt();
//		fun(n);
//		funrev(n);
		Both(n);

	}
//	static void fun(int n)
//	{
//		if(n==0)
//		{
//			return;
//		}
//		System.out.print(n+" ");
//		fun(n-1);
//	} 
//	
//	static void funrev(int n)
//	{
//		if(n==0)
//		{
//			return;
//		}
//		funrev(n-1);
//		System.out.print(n+" ");
//	} 
	
	static void Both(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n+" ");
		Both(n-1);
		System.out.print(n+" ");
	}
}
