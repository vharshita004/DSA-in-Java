import java.util.Arrays;

public class A7 {
    public static void main(String[] args) {
          fun(12,34,5,4,7,9);

          //Wrong - order must be correct
        // multiple(12, "Harshita", 13); 
        multiple(12, 14, "Harshi", "Sneha", "Nayni");
    }

    static void fun(int ...var) {
          System.out.println(Arrays.toString(var));
    }

    static void multiple(int a, int b, String ...str) {
        System.out.println(a +"   " +  b + "  " + Arrays.toString(str));
    }
}
