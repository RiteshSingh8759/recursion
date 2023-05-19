package org.kloc.LambdaExpression;
import java.util.Scanner;
import java.util.function.Predicate;

public class predicate {

	public static void main(String[] args) 
	{
		// Ex=1
		Predicate<Integer> p=i->(i<10);
		Scanner Sc=new Scanner(System.in);
		System.out.print("enter a number that you want to check = ");
		int n=Sc.nextInt();
		System.out.println(p.test(n));
		//Ex=2 check whether the given string of length 4 or not
		Predicate<String> S=i->(i.length()>=4);
		System.out.print("enter the string that you want to check that the given string length is 4 or not = ");
		String st=Sc.next();
		System.out.println(S.test(st));
		// checking the multiple value using test method
		Predicate<String> ch=a->(a.length()>=6);
		String[] ar= {"ritesh","golu","pulkit","aditya","sushma"};
		for(int i=0;i<ar.length;i++)
		{
			if(ch.test(ar[i]))
			{
				System.out.print(ar[i]+" ");
			}
		}
		
		
		
	}

}
