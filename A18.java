 //Linear Search for string

public class A18 {
    public static void main(String[] args) {

        String str = "Harshita";
        
        char l = 'a';

        System.out.println(stringLinearSearch(str, l));
    }
     public static String stringLinearSearch(String str, char target) {
        if(str.length() == 0)
           return "String is empty";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == target)
               return target + " is found at index " + i;
        }

        return "target is not found";
     }
    
}
 