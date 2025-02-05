package Abstraction;

abstract class AbsClass{
    abstract void  add();
    void show(){
        System.out.println("show method");
    }
}

class User extends AbsClass{ //single inheritance

    @Override
    void add() {
       System.out.println("i am from User Class");
    }
}
class UserChild extends User{ //this concept of multi level
    void multiLevelMethod(){
        System.out.println("i am from UserChild");
    }
}
public class MultiAbstract {

    public static void main(String[] args) {
        UserChild userChild = new UserChild();
        userChild.multiLevelMethod();
        userChild.add();
        userChild.show();

    }
}

