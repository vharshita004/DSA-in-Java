import java.util.Arrays;

public class A9 {
    
    public static void main(String[] args) {
          int[] arr = new int[5];
          arr[0] = 5;
          arr[1] = 34;
          arr[2] = 10;
          arr[3] = 55;
          arr[4] = 7;

          System.out.println(arr.length);

          for(int i=0; i<arr.length; i++) {
               System.out.print( " " + arr[i]);
          }

          for(int num : arr) {
            System.out.println(num);
          }

          System.out.println(Arrays.toString(arr));
          
    }
    
}
