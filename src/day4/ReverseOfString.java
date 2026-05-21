package day4;

public class ReverseOfString {
    public static void main(String[] args){
        String original =("Be Happy");
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);

    }
    
}
