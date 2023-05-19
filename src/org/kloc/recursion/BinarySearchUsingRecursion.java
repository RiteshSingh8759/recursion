package org.kloc.recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sze of an array ");
		int size=sc.nextInt();
		int[] ar=new int[size];
		System.out.println("enter the array element = ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("enter the targeted element = ");
		int target=sc.nextInt();
		int res=search(ar,target,0,ar.length-1);
		System.out.println("the targeted element index is = "+res);
	}
	static int search(int[] ar,int target,int s,int e)
	{
		if(s>e)
		{
			return -1;
		}
		int m=s+(e-s)/2;
		if(ar[m]==target)
		{
			return m;
		}
		if(ar[m]>target)
		{
			return search(ar,target,s,m-1);
		}
		return search(ar,target,m+1,e);
	}
}
