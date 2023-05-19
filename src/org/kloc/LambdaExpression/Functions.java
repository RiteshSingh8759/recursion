package org.kloc.LambdaExpression;

import java.util.function.Function;

public class Functions 
{
	public static void main(String[] args) 
	{
		Function<Integer,Integer> f=e->(e*e);
		System.out.println(f.apply(10));
		System.out.println(f.apply(3));
		System.out.println(f.apply(6));
		System.out.println(f.apply(8));
		System.out.println(f.apply(12));
		// passing string and returning its length
		Function<String,Integer> f2=st->(st.length());
		System.out.println(f2.apply("ritesh"));
		System.out.println(f2.apply("siya"));
		System.out.println(f2.apply("sushma"));
		System.out.println(f2.apply("pushparaj"));
	}
}
