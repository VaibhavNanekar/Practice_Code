package AccessModifier;

import java.sql.SQLOutput;

class c1 {
    public int a =10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    public void sum(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class AccessModifier1 {
    public static void main(String[] args) {
        c1 b =new c1();
        b.sum();
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
    }
}