package org.kloc.recursion;

import java.util.Scanner;

public class triponacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first term = ");
		int a=sc.nextInt();
		System.out.println("enter the second term = ");
		int b=sc.nextInt();
		System.out.println("enter the third term = ");
		int c=sc.nextInt();
		System.out.print(a+" "+b+" "+c+" ");
		int d=3;
		while(d<=20)
		{
			int fourth=a+b+c;
			System.out.print(fourth+" ");
			a=b;
			b=c;
			c=fourth;
			d++;
		}
		
	
	}

}
