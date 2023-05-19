package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;

public class AverageofAlltheNumbers {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,4,3);
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
	}

}
