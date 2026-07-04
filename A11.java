import java.util.Scanner;
import java.util.Arrays;

public class A11 {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];
    
        Scanner sc = new Scanner(System.in);
    
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        
        //print 2D array
        //1st way
        // for(int i=0; i<arr.length; i++) {
        //     for(int j=0; j<arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        //2 way
        // for(int row=0; row<arr.length; row++)
        //  System.out.println(Arrays.toString(arr[row]));

        //3 way
        for(int[] i : arr) {
           System.out.println(Arrays.toString(i));
        }
    }
}