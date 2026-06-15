import java.util.Scanner;

public class A1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if(max < b) {
          max = b;
        }
        if(max < c) {
            max = c;
        }

          System.out.println(max + " is largest");
    }

}
