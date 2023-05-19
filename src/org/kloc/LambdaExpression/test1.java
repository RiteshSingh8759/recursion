package org.kloc.LambdaExpression;
@FunctionalInterface
interface cab
{
	public void bookCab();
}

public class test1 
{
	public static void main(String[] args) 
	{
		cab cab1=()->System.out.println("Ola cab is booked.....");
		cab1.bookCab();		
	}
}
