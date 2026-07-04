//No fixed column

public class A12 {
    public static void main(String[] args) {
        int[][] arr = {
                     {1, 34, 56, 78},
                     {45, 6},
                     {34, 0, 12}
        };

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
