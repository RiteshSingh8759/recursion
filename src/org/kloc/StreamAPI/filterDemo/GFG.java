package org.kloc.StreamAPI.filterDemo;

import java.io.*;

class GFG {
    static int findTrailingZeros(int n)
    {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
 
        return count;
    }
    public static void main(String[] args)
    {
        int n = 25;
        System.out.println("Count of trailing 0s in " + n
                           + "! is "
                           + findTrailingZeros(n));
    }
}
 

