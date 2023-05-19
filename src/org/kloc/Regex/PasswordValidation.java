package org.kloc.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Given String = ");
		String st=sc.next();
		// for any country code with their 10 digit mobile number
		Pattern p1=Pattern.compile("([+]?([0-9]{1}?[-]?[0-9]{0,3})?[-])?([6789]{1}[0-9]{9})");
		Matcher m=p1.matcher(st);
		boolean p5=Pattern.matches("([+]?([0-9]{1}?[-]?[0-9]{0,3})?[-])?([6789]{1}[0-9]{9})", st);
		System.out.println(m.matches());
		System.out.println(p5);
		System.out.println("enter the given password = ");
		String s=sc.next();
		// for password
		Pattern p2=Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[%$#@-_.*!+/]).{8,20}");
		Matcher m1=p2.matcher(s);
		System.out.println(m1.matches());
		System.out.println("Enter the Given Email = ");
		String e=sc.next();
		// for email id
		Pattern p3=Pattern.compile("[A-Za-z0-9([-_.])?]+[@]{1}[a-z]+[.-_]?[a-z]?[.]{1}[a-z]{2,3}");
		Matcher m2=p3.matcher(e);
		System.out.println(m2.matches());
		
	}

}
