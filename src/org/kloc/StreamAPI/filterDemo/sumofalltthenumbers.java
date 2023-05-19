package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class sumofalltthenumbers 
{
	public static void main(String[] args) 
	{
		List<Integer> list=Arrays.asList(1,4,3,5,53,43,34,12,23,2,3,4,32,4,24);
		
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println("the sum of integer is = "+sum.get());
	}
}
