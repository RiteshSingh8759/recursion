package org.kloc.LambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class cons {

	public static void main(String[] args) 
	{
		ArrayList<consum> al=new ArrayList();
		al.add(new consum("Ritesh",20000,"Male"));
		al.add(new consum("Siya",30000,"female"));
		al.add(new consum("Sushma",40000,"female"));
		al.add(new consum("Rahul",40000,"Male"));
		Function<consum,Integer> fn=e->(e.salary*10)/100;
		Predicate<Integer> pr=b->b>3000;
		Consumer<consum> c=a->{
				System.out.print(a.name+" ");
				System.out.print(a.salary+" ");
				System.out.println(a.gender+" ");
		};
		for(consum e:al)
		{
			int bonus=fn.apply(e);
			if(pr.test(bonus))
			{
				c.accept(e);
			}
		}
	}

}
