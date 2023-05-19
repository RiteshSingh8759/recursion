package org.kloc.LambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		predicateformultipleobjects emp1=new predicateformultipleobjects("Ritesh",50000,2);
		predicateformultipleobjects emp2=new predicateformultipleobjects("Sushma",20000,3);
		predicateformultipleobjects emp3=new predicateformultipleobjects("Siya",50000,2);
		predicateformultipleobjects emp4=new predicateformultipleobjects("pulkit",60000,5);
		predicateformultipleobjects emp5=new predicateformultipleobjects("Utkarsh",20000,1);
		ArrayList<predicateformultipleobjects> ar=new ArrayList();
		ar.add(emp1);
		ar.add(emp2);
		ar.add(emp3);
		ar.add(emp4);
		ar.add(emp5); 
		Predicate<predicateformultipleobjects> pr=e->(e.salary>30000&&e.experience>=2);
		for(predicateformultipleobjects p:ar)
		{
			if(pr.test(p))
			{
				System.out.println(p.Ename);
			}
		}
		
	}

}
