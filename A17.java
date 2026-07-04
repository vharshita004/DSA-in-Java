//Linear Search for string

public class A17 {
    public static void main(String[] args) {

        String[] str = {"mohan", "rohan", "sohan", "tohan", "gohan", "lohan"};
        
        String  s = "tohan";

        System.out.println(stringLinearSearch(str, s));
    }
     public static String stringLinearSearch(String[] str, String target) {
        if(str.length == 0)
           return "Array is empty";

        for(int i=0; i<str.length; i++) {
            if(str[i] == target)
               return target + " is found at index " + i;
        }

        return "target is not found";
     }
    
}
