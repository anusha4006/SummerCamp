package day6.Is_A;

public class MultipleInheritance {
    public void m1(){
        System.out.println("m1 in class A");
    }
    
}
class B{
    public void m1(){
        System.out.println("m1 in class B");
    }
}
//java wont support multiple inheritance due to ambiguous
class C extends A, B{
}
//alternate way to implements multile inheritance
 interface  B{
    public void m1();
 }
 class  C implements A,B{
    public void m1() {
        System.out.println("m1");

    } 
 
 }
 public class MultipleInheritance{
    public static void main(String[] args) {
        
    }
 }

    

