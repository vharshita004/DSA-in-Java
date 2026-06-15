//Pass by value

public class A6 {
    public static void main(String[] args) {
          int a = 49;
          A6 aa = new A6();
          aa.changeName(a);
          System.out.println(a);
    }
     void changeName(int a) {
        a = 50;
    }
}