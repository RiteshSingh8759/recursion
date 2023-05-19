package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printEvenOdd {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60,4,3);	
		List<Integer> l=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(l);
		//odd 
		List<Integer> l1=list.stream().filter(e->e%2==1).collect(Collectors.toList());
		System.out.println(l1);
	}

}
