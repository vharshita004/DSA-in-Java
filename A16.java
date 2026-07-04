//Searching - Linear Search 

import java.util.Scanner;

public class A16 {

    //Search the target and return the index
     public static int linearSearch1(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }

        //this line will execute if none of the above return statement is executed
        return -1;
    }
     
    //Search the target and return true or false
     public static boolean linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }

        //this line will execute if none of the above return statement is executed
        return false;
    }

     //Search the target and return value of element
     public static int linearSearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return arr[i];
            }
        }

        //this line will execute if none of the above return statement is executed
        return Integer.MAX_VALUE;
        //here we cannot return -1 because it can be a value at any index
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = {12, 45, 23, 7, 89, 90, 34, 6};

       System.out.println(linearSearch3(arr, n));
    }
    
}
