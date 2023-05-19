package org.kloc.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class permutationOfGivenString {

	public static void main(String[] args) {
		String st="12";
		List<String> l=permutation("",st);
		List<String> s=l.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).equals(st))
			{
				System.out.println(s.get(i+1));
			}
		}
	}
	static List<String> permutation(String a,String b)
	{
		if(b.isEmpty())
		{
			List<String> list=new ArrayList<>();
			list.add(a);
			return list;
		}
		char ch=b.charAt(0);
		List<String> ans=new ArrayList<>();
		for(int i=0;i<=a.length();i++)
		{
			String f=a.substring(0,i);
			String s=a.substring(i,a.length());
			ans.addAll(permutation(f+ch+s,b.substring(1)));
		}
		return ans;
	}

}
