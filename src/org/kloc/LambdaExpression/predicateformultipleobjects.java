package org.kloc.LambdaExpression;
 class predicateformultipleobjects
{
	String Ename;
	int salary;
	int experience;
	public predicateformultipleobjects(String name,int sal,int exp)
	{
		Ename=name;
		salary=sal;
		experience=exp;
	}
	@Override
	public String toString()
	{
		return Ename;
	}
}

