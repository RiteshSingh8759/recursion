package org.kloc.LambdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee 
{
	String ename;
	int salary;
	Employee(String ename,int salary)
	{
		this.ename=ename;
		this.salary=salary;
	}
	
}
public class Demo{
	public static void main(String[] args) 
	{
		ArrayList<Employee> ar=new ArrayList();
		ar.add(new Employee("Ritesh",40000));
		ar.add(new Employee("Rahul",50000));
		ar.add(new Employee("Nitesh",60000));
		ar.add(new Employee("Siya",45000));
		ar.add(new Employee("sushma",20000));
		Function<Employee,Integer> f=e->{
			int sal=e.salary;
			if(sal>=10000&&sal<=20000)
			{
				return (sal*10)/100;
				
			}
			if(sal>20000&&sal<=30000)
			{
				return (sal*20)/100;
				
			}
			if(sal>30000&&sal<=40000)
			{
				return (sal*30)/100;
				
			}
			else
			{
				return (sal*40)/100;
			}
			};
		Predicate<Integer> p=b->b>5000;
		for(Employee e:ar)
		{
			int bonus=f.apply(e);
			if(p.test(bonus))
			{
			  System.out.println(e.ename+" "+e.salary);
			  System.out.println("Bonus is:"+bonus);
			}
		}
	}
}
