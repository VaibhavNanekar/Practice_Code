package Polymorphism;


public class PolyDemo {
       void add(int a){
           System.out.println("a:" +a);
       }
    void add(int a , int b){
        System.out.println("a+b : " +(a+b));

    }
    void add(int a, int b ,int c){
        System.out.println("a+b+c:" +(a+b+c));
    }

    public static void main(String[] args) {
           PolyDemo p = new PolyDemo();

       p.add(10);
       p.add(10,20);
       p.add(10,20,39);
    }
}
