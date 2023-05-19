package org.kloc.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findProperFraction {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the given the number =");
		long n=sc.nextLong();
		long a=fraction(n);
		System.out.println(a);

	}
	static long fraction(long n)
	{
		List<Long> list=new ArrayList<>();
		
		for(long i=2;i<n;i++)
		{
			if(n%i==0)
			{
				long j=i;
				long count=1;
				while(j*count<n)
				{
					list.add(j*count);
					count++;
				}
			}
		}
		long a=(Long) list.stream().distinct().count();
	  return n-a-1;
	}

}
