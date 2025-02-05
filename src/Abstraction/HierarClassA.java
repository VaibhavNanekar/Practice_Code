package Abstraction;

abstract class ArithmeticOperater{
    abstract void operations();
    void display (){
        System.out.println(" Arithmetic Operators");
    }
}
class Sum  extends ArithmeticOperater{

    @Override
    void operations() {
        System.out.println("Addition");
    }
}
class Remainder extends ArithmeticOperater{

    @Override
    void operations() {
        System.out.println("Substract");
    }
}
public class HierarClassA {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.operations();
        obj.display();
       Remainder obj1 = new Remainder();
        obj1.operations();
        obj1.display();
    }
}
