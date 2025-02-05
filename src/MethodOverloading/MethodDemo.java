package MethodOverloading;
class A {
    void sum(int a){
        System.out.println("Method One");

    }
    void sum(int a,int b){
        System.out.println("Method Second");

    }
    void sum(int a,int b, int c){
        System.out.println("Method Third");

    }
}
public class MethodDemo {
    public static void main(String[] args) {
        A obj=new A();
        obj.sum(2);
        obj.sum(2,3,4);
        obj.sum(2,3);
    }

}
