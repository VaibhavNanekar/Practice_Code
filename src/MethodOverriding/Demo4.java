package MethodOverriding;
class Person {

    // Method that displays the
    // role of a person
    void role() {
        System.out.println("I am a person.");
    }
}
class Father extends Person {

    // Overridden method to show
    // the role of a father
    @Override
    void role() {
        System.out.println("I am a father.");
    }
}
public class Demo4 {

        public static void main(String[] args) {

            // Creating a reference of type Person
            // but initializing it with Father class object
            //Person p = new Father();
Person p1=new Person();
            // Calling the role method. It calls the
            // overridden version in Father class
           // p.role();
            p1.role();;
            Father f= new Father();
            f.role();
        }
    }


    // Derived class Father that
// overrides the role method



