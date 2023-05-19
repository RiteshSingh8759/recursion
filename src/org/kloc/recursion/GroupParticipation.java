package org.kloc.recursion;
import java.util.Scanner;

public class GroupParticipation 
{
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the input number =");
	        int n= scanner.nextInt();
	        scanner.close();
	        
	        int groups = find(n);
	        System.out.println("Number of participants are " + groups);
	    }
	    
	    public static int find(int n) {    
	        int x = (int)Math.sqrt(n* 2); 
	        return x+1;
	    }
	

}
