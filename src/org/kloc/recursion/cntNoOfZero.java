package org.kloc.recursion;

import java.util.Scanner;

public class cntNoOfZero 
{
	static int count=0;
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=count(n);
		System.out.println(count);
	}
	static int count(int n)
	{
		if(n==0)
		{
			return 0;
		}
		int rem=n%10;
		if(rem==0)
		{
			count++;
		}
		return count(n/10);
	}
//	public static void main(String[] args) 
//	{	
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int b=count(n,0);
//		System.out.println(b);
//	}
//	static int count(int n,int c)
//	{
//		if(n==0)
//		{
//			return c;
//		}
//		int rem=n%10;
//		if(rem==0)
//		{
//			return count(n/10,c+1);
//		}
//		return count(n/10,c);
//	}

}
