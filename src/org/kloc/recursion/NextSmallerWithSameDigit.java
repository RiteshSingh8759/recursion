package org.kloc.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class NextSmallerWithSameDigit
{
	public static long nextSmallerNumber(long n)
    {
      char [] s = String.valueOf(n).toCharArray();
      for(int i = s.length - 2; i >= 0; i--){
         for (int j = s.length-1; j > i; j--){
           if(s[i] >s[j]){
             char tmp = s[i];
             s[i] = s[j];
             s[j] = tmp;
             Arrays.sort(s, i+1, s.length);
             return Long.valueOf(String.valueOf(s));
           }
         }
      }
      return -1;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number = ");
		long a=sc.nextLong();
		long n=nextSmallerNumber(a);
		System.out.println(n);		
	}
}
