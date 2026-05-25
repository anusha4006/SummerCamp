package day7;

public class NullPointException {
    public static void main(String[] args) {
        try{
        String s = null;
        String s1 = "raj";
           if(s.equals(s1)){
            System.out.println("Equal");
        }
        System.out.println(9/0);
    }catch(NullPointerException e)
    {
        System.out.println("null");
    }
    catch(ArithmeticException e)
    {
        System.out.println("AE");
    }
    

    }
    
}
