//Search in 2D array

import java.util.Arrays;

public class A21 {

    public static int[] linearSearchIn2D(int[][] arr, int target) {
        //assume arr.length != 0
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
               if(arr[i][j] == target)
                  return new int[] {i, j};
            }
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {3,56,23,6},
                        {45,2,67,9},
                        {8,34,12,10}
                      };
        int n = 10;
        
        int[] ans = linearSearchIn2D(arr, 10);
        System.out.println(Arrays.toString(ans));
    }
    
}
