public class A19 {

    public static int searchInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0)
          return -1;

        for(int i=start; i<=end; i++) {
            if(arr[i] == target) 
              return i;
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,34,5,78,20,5,67};

        int n = 20;

        System.out.println(searchInRange(arr, n, 1, 5));
    }
}
