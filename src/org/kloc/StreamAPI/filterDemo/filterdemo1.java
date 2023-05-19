package org.kloc.StreamAPI.filterDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class filterdemo1 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		al.add(10);
//		al.add(15);
//		al.add(20);
//		al.add(25);
//		al.add(30);
//		al.add(40);
	   List<Integer> al1=Arrays.asList(10,15,20,25,30,40);
	   List<Integer> evennumberlist=new ArrayList<Integer>();
	   // without using stream
//	   for(int n:al1)
//	   {
//		   if(n%2==0)
//		   {
//			   evennumberlist.add(n);
//		   }
//
//	   }
//	   System.out.println(evennumberlist);
	   //with the help of stream
//	   evennumberlist=al1.stream().filter(n->n%2==0).collect(Collectors.toList());
//	   System.out.println(evennumberlist );
//	   al1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	   al1.stream().filter(n->n%2==0).forEach(System.out::println);
	   
	   
	   
	}
}
