package org.kloc.recursion;

public class checkArrayIsSortedOrNot 
{
	public static void main(String[] args) 
	{
		int[] ar= {1,5,3,4,5,6,7,8};
		System.out.println("the array is sorted="+sorted(ar,0));
	}
	static boolean sorted(int[] ar,int in)
	{
		if(in==ar.length-1)
		{
			return true;
		}
		return ar[in]<ar[in+1]&&sorted(ar,in+1);
	}
}
