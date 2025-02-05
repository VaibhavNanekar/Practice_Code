package DownCasting;
class A{
    void m1(){
        System.out.println("Class A");
    }
}
class B extends  A{
    void m2(){
        System.out.println("Class B");
    }
}
public class DownCasting1 {
    public static void main(String[] args) {
    //   A a= new B();
       B b= (B)new A();
        //B b =new B();
        //b.m1();
       // a.m2();
       //a.m1();
    }
}
