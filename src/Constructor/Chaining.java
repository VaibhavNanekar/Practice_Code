package Constructor;
class P{
    String s = "Parent Class";
}
class C extends P{
    String s = "Child Class";
    public void m1(){
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}
public class Chaining {
    public static void main(String[] args) {
        C c =new C();
        c.m1();
        P p =new P();

    }
}
