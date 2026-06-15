import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");

        char alpha = sc.next().trim().charAt(0);

        if(alpha >= 65 && alpha <= 91) {
            System.out.println(alpha + " -- Uppercase");
        }else {
             System.out.println(alpha + "--Lowercase");
        }
    }
    
}
