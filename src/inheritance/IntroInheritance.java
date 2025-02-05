package inheritance;

public class IntroInheritance   {
    void  show(){
        System.out.println("show method");
    }
    public static void main(String[] args) {
        IntroInheritance introInheritance = new IntroInheritance();
        introInheritance.show();
        InheritanceTest obj =new InheritanceTest();
        obj.testMethod();
    }
}
class InheritanceTest {
    void testMethod(){
        System.out.println("this method belongs to a class Inheritancetest");
    }
}