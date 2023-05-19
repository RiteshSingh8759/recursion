package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfTheNumber {

	public static void main(String[] args) {
		try {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60,4,3);
		double al=list.stream().map(e->e*e).filter(e->e>900).mapToInt(e->e).average().getAsDouble();
		System.out.println(al);
		}
		catch(Exception n)
		{
			n.getMessage();
			System.out.println("no element is greater than the 100");
		}
	}

}
