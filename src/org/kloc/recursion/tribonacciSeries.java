package org.kloc.recursion;

import java.util.Scanner;

public class tribonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array =");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the array element =");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.print("enter the number of term from where u want the series =");
		int a=sc.nextInt();
		int[] ar2=new int[a];
		int k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar.length==1) {ar}
			ar2[k]=ar[i];
			k++;
		}		
		for(int i=ar.length-1;i<a;i++)
		{
			
		}
		
	}

}
