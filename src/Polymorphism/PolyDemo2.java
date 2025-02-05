package Polymorphism;

public class PolyDemo2 {
    void  add(int a){
        System.out.println("a:"+(a));

    }
    int   add(int a,int b){
        System.out.println("a+b:"+ (a+b));
        return a*b;
    }
    void add( double a, double b){
        System.out.println("a+b+c:"+ (a+b));
    }

    public static void main(String[] args) {
        PolyDemo2 p1 = new PolyDemo2();
        p1.add(10);
        p1.add(10 , 20);
        p1.add(2.1,5.1);

    }

}
