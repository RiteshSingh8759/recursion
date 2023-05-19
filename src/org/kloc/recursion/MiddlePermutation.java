package org.kloc.recursion;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MiddlePermutation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the given string = ");
		String st=sc.next();
		Set<String> set=permutation("",st);
		
	}
	static Set<String> permutation(String p,String up)
    {
    if(up.isEmpty())
      {
      Set<String> list=new TreeSet<>();
      list.add(p);
      return list;
    }
    char ch=up.charAt(0);
    Set<String> ans=new TreeSet<>();
    for(int i=0;i<=p.length();i++)
      {
      String f=p.substring(0,i);
      String s=p.substring(i,p.length());
      ans.addAll(permutation(f+ch+s,up.substring(1)));
    }
    return ans;
  }
}
