package org.kloc.StreamAPI.filterDemo;

public class BiConsumer 
{
	public static void main(String[] args) 
	{
		java.util.function.BiConsumer<Integer,Integer> c=(a,b)-> System.out.println(a+b);
		c.accept(5,6);
	}
}
