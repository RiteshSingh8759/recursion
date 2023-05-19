package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;

public class maxAndMin {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(-1,222,234,567,890,432,236,236,222);
		int s=list.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println(s);
		System.out.println("--------------------");
		int s1=list.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println(s1);
	}

}
