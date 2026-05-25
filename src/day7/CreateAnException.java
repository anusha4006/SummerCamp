package day7;

public class CreateAnException {
    public static void main(String[] args) {
        int n=40;
        try{
            if(n>18){
                throw new ArithmeticException(">18");
            }
            System.out.println("eligible to work");
    }catch(ArithmeticException e){
        System.out.println(" not eligible to working");
        }

        }
    }
    

