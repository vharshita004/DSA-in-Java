//search min no. in an array

import java.util.Arrays;

public class A20 {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 56, 8};

        int min = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) 
               min = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum value in array is " + min);
    }
    
}
