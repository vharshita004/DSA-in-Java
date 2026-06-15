import java.util.Scanner;

public class B2 {

    public static void fun(int num) {
       
        if(num == 0)
          return;
        
        System.out.println(num);

        fun(num-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        fun(n);
        
    }
    
}