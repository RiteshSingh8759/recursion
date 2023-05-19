package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortingthevalue {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(-1,222,234,567,890,432,236,236,222);
		List<Integer> l=list.stream().distinct().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList());
		int[] ar=new int[l.size()];
		System.out.println(l);
		
	}

}
