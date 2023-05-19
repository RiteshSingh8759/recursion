package org.kloc.recursion;
import java.util.Scanner;
public class FabonacciSeriesUsingRecursion {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number = ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
		  int res=fabo(i);
		   System.out.println(res);
		}
	}
	static int fabo(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fabo(n-1)+fabo(n-2);
	}
}
