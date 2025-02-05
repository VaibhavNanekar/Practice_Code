package Upcasting;
class A{
    void m1(){
        System.out.println("Class A");
    }
}
class B extends A{
   void m2(){
        System.out.println("Class B");
    }

}
public class Upcast1 {
    public static void main(String[] args) {
//        B a =(B) new A();
        A a= new B();
       // A a =new A();
        a.m1();
        ((B) a).m2();


    }
}
