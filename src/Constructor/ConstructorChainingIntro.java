package Constructor;
// Constructor chaining part . when we can only create object of child class in main method then the output will be shown the parent class and super class aslo.
class SuperParent{
    SuperParent(){
        System.out.println("Super parent");
    }
}
class Parent extends SuperParent{
    Parent(){
        System.out.println("parent Constructor");
    }
}
public class ConstructorChainingIntro extends Parent {
    ConstructorChainingIntro(){
        System.out.println(" Child Constructor");
    }

    public static void main(String[] args) {
       // ConstructorChainingIntro child =new ConstructorChainingIntro();
       // Parent parent = new Parent();
        SuperParent sp = new SuperParent();
    }
}
