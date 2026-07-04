//Swap elements in an array
import java.util.Arrays;

public class A13 {
    public static void main(String[] args) {
        int[] arr = {1, 45, 67, 78, 90, 4};

        swap(arr, 0, 5);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2) {
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
    }
    
}
