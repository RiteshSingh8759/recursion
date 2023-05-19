package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class firstHighest {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,222,234,567,890,432,236,236,222);
		// second highest
		list.stream().sorted((a,b)->-a.compareTo(b)).limit(2).skip(1).forEach(e->System.out.println(e));
		
		// first highest
		int c=list.stream().sorted((a,b)->-a.compareTo(b)).limit(2).findFirst().get();
		System.out.println(c);
	}

}
