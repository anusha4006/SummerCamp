package day6.Is_A;

public class TestClass {
    public static void main(String[] args) {
        //cse1
        C c1 = new C();
        c1.m1();
        c1.m2();
    
        //cse2
        P p2 = new P();
        p2.m1();
        //p2.m2();//not valid
        //case3
        P p1 = new C();
        p1.m1();

        

    }
    
}
