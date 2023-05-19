package org.kloc.recursion;
import java.util.Scanner;
public class TowerOfHanoi {
	static void TOH(int n,String src,String helper,String dest)
	{
		if(n==1)
		{
			System.out.println("Transfer disk "+n+" from"+src.charAt(0)+" to "+dest.charAt(0));
			return;
		}
		TOH(n-1,src,dest,helper);
		System.out.println("Transfer disk "+n+" from"+src.charAt(0)+" to "+dest.charAt(0));
		TOH(n-1,helper,src,dest);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of disc = ");
		int n=sc.nextInt();
		TOH(n,"1","2","3");
	}

}
