package org.kloc.StreamAPI.filterDemo;
import java.util.Scanner;
public class test {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the two value = ");
		String s1=sc.next();
		String s2=sc.next();
		String st=wonDraw(s1,s2);
		System.out.println(st);
	}
	static String wonDraw(String p1,String p2)
	{
		return (p1.equals(p2)?"Draw":((p1.equals("rock")&&p2.equals("paper")||p1.equals("paper")
				&&p2.equals("scissor")||p1.equals("scissor")&&p2.equals("rock"))?"p2 won":"p1 won"));
	}

}
