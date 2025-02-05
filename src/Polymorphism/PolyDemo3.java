package Polymorphism;

public class PolyDemo3 {
    int add(int a,int b){
        return a*b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add( double a, double b){
        return a*b;
    }
    double add(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        PolyDemo3 p3= new PolyDemo3();
        System.out.println("Multiplication of Two No using int:"+(10*20));
        System.out.println("Multiplication of Two No Using Double:"+(1.0*1.0));
        System.out.println("Addi Of 3 No using int:"+(2+3+4));
        System.out.println("Addi of 3 No using double:"+(2.0+3.0+4.0));
    }
}
