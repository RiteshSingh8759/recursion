package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ignoreFirst5UsingLimitsandSkip {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,222,234,567,890,432,236,236,222);
		// distinct
		Stream<Integer> a=list.stream().distinct();
		a.forEach(e->System.out.print(e+" "));
		// first 5
		System.out.println("");
		List<Integer> li=list.stream().limit(5).collect(Collectors.toList());
		System.out.println(li);
		//sum of first 5
	
		int sum=list.stream().limit(5).reduce((b,c)-> c+b).get();
		System.out.println(sum);
		//skip 5
		
		List<Integer> li1=list.stream().skip(5).collect(Collectors.toList());
		System.out.println(li1);
		// sum of number after five skip
		int sum1=list.stream().skip(5).reduce((b,c)-> c+b).get();
		System.out.println(sum1);
	}

}
