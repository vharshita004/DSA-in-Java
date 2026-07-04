public class A23 {
    public static void main(String[] args) {
       // int[][] arr = {{3,2,1}, {1,2,3}};
       int[][] arr = {{4,5,6}, {3,7,5},{8,9}, {2,9,3}};

        int richestCust = maxSum(arr);

        System.out.println("wealth of richest customer = " + richestCust);

    }
    
    public static int maxSum(int[][] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            int rowSum = 0;
            for(int j=0; j<arr[i].length; j++) {
                 rowSum += arr[i][j];
            }
            if(rowSum > max)
               max = rowSum;
        }
    
        return max;
    }
    
}
