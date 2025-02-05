package Abstraction;

abstract class Abstraction {
    void add(){
        System.out.println("Activity");
    }
    void add1(){
        System.out.println("Its Not Mandatory to have abstract Method in abstract Class");
    }
}
class pqr extends Abstraction{
    public static void main(String[] args) {
        pqr obj =new pqr();
        obj.add();
        obj.add1();
    }
}