package org.kloc.recursion;
import java.util.Scanner;
public class ChristmasTreePizza 
{

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int s = sc.nextInt();
	        int e = sc.nextInt();
	        int moves = noMoves(s, e);
	        System.out.println(moves-1);
	    }

	    public static int noMoves(int s, int e) {
	        int sRow = get(s);
	        int eRow = get(e);
	        int sPos = getre(s, sRow);
	        int ePos = getre(e, eRow);
	        return Math.abs(sRow - eRow) + Math.abs(sPos - ePos);
	    }

	    public static int get(int n) {
	        int row = 1;
	        int sum = 0;
	        while (sum < n) {
	            sum += row;
	            row++;
	        }
	        return row - 1;
	    }

	    public static int getre(int n, int row) {
	        int start = (row - 1) * row / 2 + 1;
	        return n - start;
	    }
	}



	




