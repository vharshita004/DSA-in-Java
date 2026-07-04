//In an array how many of them contains even number of digits

public class A22 {

    public static int findDigits(int[] arr) {
        int even = 0;

        for(int n : arr) {
            int count = 0;

             if(n < 0) 
               n = n * -1;
            
            if(n == 0) 
              count = 1;

            while(n > 0) {
               n = n / 10;
                count++;  
            }
             
            if((count % 2) == 0)
               even++;
        }
        return even;
    }
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 0, 7896, 45, 789, 123456};

        int result = findDigits(nums);

        System.out.println(result);

    }
    
}
