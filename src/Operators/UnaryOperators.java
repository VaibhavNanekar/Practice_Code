package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        // a++ or ++a
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));
        // b-- or --b
        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        int p = 15;
        int q = 15;
        //p++ or ++p(post+pre increment)
        System.out.println("p : " + (+p));
        System.out.println("p : " + (-p));
        System.out.println("p : " + (p++));
        System.out.println("p : " + (++p));

        //q-- or --q(post+pre decrement)
        System.out.println("q : " + (q--));
        System.out.println("q : " + ( --q)) ;
    }
}
