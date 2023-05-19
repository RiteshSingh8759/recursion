package org.kloc.recursion;
import java.util.Arrays;
import java.util.Comparator;

public class RectanglesUnion {
    public static int calculateSpace(int[][] rectangles) {
        int totalArea = 0;
        int[] xaxis = new int[2*rectangles.length];
        int[][] yaxis = new int[2*rectangles.length][4];
		
		int i = 0;
        while(i < rectangles.length){
            xaxis[2*i] = rectangles[i][0];
            xaxis[2*i+1] = rectangles[i][2];
            yaxis[2*i] = new int[]{rectangles[i][0], rectangles[i][2],
                               rectangles[i][1], 1};
            yaxis[2*i+1] = new int[]{rectangles[i][0], rectangles[i][2],
                                 rectangles[i][3], -1};
								 ++i;
        }
        Arrays.sort(xaxis);
        Arrays.sort(yaxis, Comparator.comparing(y -> y[2]));
		i = 1;
        while(i < 2*rectangles.length){
            int Y_prev_val = 0;
            int count = 0;
            for(int j = 0; j < 2*rectangles.length; ++j){
                if(yaxis[j][0] >= xaxis[i] || yaxis[j][1] <= xaxis[i-1]) continue;
                if(count == 0) Y_prev_val = yaxis[j][2];
                count += yaxis[j][3];
                if(count == 0) totalArea += (yaxis[j][2] - Y_prev_val)*(xaxis[i] - xaxis[i-1]);
            }
			++i;
        }
        return totalArea;
    }
}