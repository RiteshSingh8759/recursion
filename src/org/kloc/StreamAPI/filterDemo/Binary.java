package org.kloc.StreamAPI.filterDemo;

import java.util.Arrays;
import java.util.List;

public class Binary {

	

	public static void main(String[] args) {
	   List<Integer> list=Arrays.asList(1,0,0,1,0,1,0,0);
	   System.out.println(Integer.parseInt(list.toString().replaceAll("[^01]", ""),2));

	}

}
