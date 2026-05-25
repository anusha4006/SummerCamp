package day7;

import java.util.Scanner;

public class PowerOfFour {
     public static void main(String[] java){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
        if((t&(t-1)&&(t>=4))==0){
            System.out.println("Power of four");
        
        }else{
            System.out.println("not power of four");
        }
    }sc.close();
    
}
}

