package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicate {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,222,234,567,890,432,236,236,222);
//		List<Integer> l=list.stream().filter(e -> Collections.frequency(list,e)>1).collect(Collectors.toList());
//		System.out.println(l);
		Set<Integer> s=new HashSet<Integer>();
		
		List<Integer> l=list.stream().filter(e-> s.add(e)).collect(Collectors.toList());
		System.out.println(l);
	}

}
