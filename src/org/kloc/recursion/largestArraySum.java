package org.kloc.recursion;

public class largestArraySum {

	static int maxLen(int arr[])
    {
        int big = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0)
                   big = Math.max(big, j - i + 1);
            }
        }
        return big;
    }
    public static void main(String args[])
    {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Length of longest 0 sum subarray is " + maxLen(arr));
    }

}
