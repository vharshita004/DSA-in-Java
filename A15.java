//reverse an array

import java.util.Arrays;

public class A15 {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 45, 6, 10, 67};

        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));

        
    }
    
}
