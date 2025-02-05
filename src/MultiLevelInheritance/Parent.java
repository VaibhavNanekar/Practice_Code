package MultiLevelInheritance;

public class Parent{
void parent(){
    System.out.println("Parent");
}
}
class Child1 extends Parent{
    void child1(){
        System.out.println("Child1");
    }
}
class Child2 extends Parent{
    void child2(){
        System.out.println("Child2");
    }
    public static void main(String args[]){
        Child1 obj = new Child1();
        Child2 obj1 = new Child2();
        obj.parent();
        obj.child1();
        obj1.child2();
    }
}

