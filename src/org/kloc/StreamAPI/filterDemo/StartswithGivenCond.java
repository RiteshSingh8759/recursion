package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartswithGivenCond {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,222,234,567,890,432,236,211,22);
		List<Integer> l=list.stream().map(e-> String.valueOf(e)).filter(e-> e.startsWith("22")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(l);
	}

}
