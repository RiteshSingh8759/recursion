package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {

	public static void main(String[] args) {
		String st="bbbaaabaaaa";
//		Map<String,List<String>> l=Arrays.stream(st.split("")).collect(Collectors.groupingBy(s->s));
//		System.out.println(l.toString());
		Map<String,Long> l1=Arrays.stream(st.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		long l2=l1.values().stream().max((a,b)->a.compareTo(b)).get();
		List<Object> l3=l1.entrySet().stream().filter(e->e.getValue()==l2).collect(Collectors.toList());
		System.out.println(l3.get(0));
		
		// trailing zeroes
		
		
	}

}
