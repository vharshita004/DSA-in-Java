//Largest element in an array

public class A14 {
    public static void main(String[] args) {
        int[] arr = {};

        System.out.println(maxElement(arr));
    }

    public static int maxElement(int[] arr) {
        //if(arr.length = 0) 
             //return -1;
                 //or
        if(arr != null) {
           System.out.println("Array is empty");
           return -1;
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                 max = arr[i];
            }
        } 
        return max;
    }
    
}
