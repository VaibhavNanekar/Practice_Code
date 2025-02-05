package Abstraction;

abstract class MyClass {
    public void display(){
        System.out.println("This is a Method of abstract Class");
    }
}
public class AbstractClass3 extends MyClass {
    public static void main(String[] args) {
        MyClass m1 = new AbstractClass3();
        m1.display();
    }
}