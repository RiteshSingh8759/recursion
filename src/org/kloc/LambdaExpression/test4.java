package org.kloc.LambdaExpression;

@FunctionalInterface
interface Cab1{
	public String BookCab(String source,String destination);
}

public class test4 
{
	public static void main(String[] args) 
	{
		Cab1 c1=( source, destination)->{
					System.out.println("ola cab is booked from "+source+" to "+destination);
					return ("price : 5000");
					};
		System.out.println(c1.BookCab("BTM Layout","White Field"));
	}
}
