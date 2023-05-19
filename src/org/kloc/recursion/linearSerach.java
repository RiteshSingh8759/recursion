package org.kloc.recursion;

public class linearSerach {

	public static void main(String[] args) 
	{
		int[] ar= {3,2,18,9};
		int target=3;
		int index=search(ar,target,0);
		System.out.println("the index of this targeted element is = "+index);
	}
	static int search(int[] ar,int target,int i)
	{
		if(i==ar.length) {return -1;}
		if(ar[i]==target) {return i;}
		return search(ar,target,i+1);
	}
}
