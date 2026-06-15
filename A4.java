import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int l = sc.nextInt();

        System.out.println("Enter a no. which you want to count: ");
        int n = sc.nextInt();
 
        int count = 0;
    
        while(l > 0) {
            if(l % 10 == n) {
              count++;
            }

            n = n / 10;
            
        }
        System.out.println(count);
    }
    
}
