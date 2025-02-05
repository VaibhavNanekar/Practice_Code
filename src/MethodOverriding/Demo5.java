
package MethodOverriding;
//class A {
//    String display(){
//        System.out.println("A");
//        return String;
//    }
//}
//class B extends A {
//    @Override
//    String display() {
//        System.out.println("B");
//        return String;
//    }
//}
//public class Demo5 {
//    public static void main(String[] args) {
//        B b = new B();
//        b.display();
//    }
//}

class A {
    Object show (){
        System.out.println("A");
        return 15;
    }
}

public class Demo5 extends A {
    @Override
    Integer show() {
        System.out.println("Demo");
        return 15;
    }

    public static void main(String[] args) {
        Demo5 d = new Demo5();
        d.show();
    }
}