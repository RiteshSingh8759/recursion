package org.kloc.StreamAPI.filterDemo;
import java.util.*;
import java.util.stream.Collectors;
public class Delete_occurrences_of_an_element_if_it_occurs_more_than_n_times 
{
	    public static List<Integer> limitList(List<Integer> lst, int n) {
	        Map<Integer, Integer> count= new HashMap<>();
	        return lst.stream().filter(x->!count.containsKey(x)||count.get(x)<n).peek(x->count.put(x, count.getOrDefault(x, 0)+1)).collect(Collectors.toList());
	                
	    }

	    public static void main(String[] args) {
	        List<Integer> lst1 = Arrays.asList(1, 2, 3, 1, 2, 1, 2, 3);
	        List<Integer> result1 = limitList(lst1, 2);
	        System.out.println(result1); // Output: [1, 2, 3, 1, 2, 3]

	        List<Integer> lst2 = Arrays.asList(20, 37, 20, 21);
	        List<Integer> result2 = limitList(lst2, 1);
	        System.out.println(result2); // Output: [20, 37, 21]
	    }
	

}
