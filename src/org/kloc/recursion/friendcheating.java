package org.kloc.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class friendcheating 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number= ");
		long n=sc.nextLong();
		List<long[]> res=removNb(n);
		res.forEach(e->System.out.println(e[0]+" "+e[1]));
		
	}
	public static List<long[]> removNb(long n)
	  {
	    List<long[]> list=new ArrayList<long[]>();
	    long sum=n*(n+1)/2;
			for(long i=1;i<=n;i++)
	      {
	        for(long j=i+1;j<=n;j++)
	          {
	           if(sum-i-j==i*j)
	            {
	            list.add(new long[] {i,j});
	            }
	         }
		    }
	    return list;
	}
}
