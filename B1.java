import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;

        fun(i, n);
    }

    public static void fun(int count, int num) {

        if(count > num)
           return;

        System.out.println(count);
        
        count++;

        fun(count, num);

    }
    
}
