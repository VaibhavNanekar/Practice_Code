package MethodOverriding;

class Parent {
    static void display() {
        System.out.println("Final method in Parent class.");
    }
}

    class Child extends Parent {
        // This will cause a compile-time error
       static void display() {
            System.out.println("Attempting to override final method in Parent class.");
         }
    }

    public class Test {
        public static void main(String[] args) {
            Child c = new Child();
            c.display(); // Output: Fin
            Parent p =new Parent();

        }
    }
