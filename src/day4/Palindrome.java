package day4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String reversed =  new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)){
            System.out.println("It is palindrome");

        }else{
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
    
}
