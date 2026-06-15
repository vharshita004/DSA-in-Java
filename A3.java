import java.util.Scanner;

public class A3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. : ");

        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;
        System.out.println(a);
        System.out.println(b);

        while(count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
            System.out.println(b);
        }
    }
    
}
