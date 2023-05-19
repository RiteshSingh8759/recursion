package org.kloc.recursion;

import java.util.Scanner;

public class NoOfStepsToReachZero {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number = ");
		int n=sc.nextInt();
		System.out.println("the no of steps thattakes to come to zero is ="+countSteps(n,0));
	}
	static int countSteps(int a,int count)
	{
		if(a==0)
		{
			return count;
		}
		if(a%2==0)
		{
			return countSteps(a/2,count+1);
		}
		return countSteps((a-1)/2,count+1);
	}

}
