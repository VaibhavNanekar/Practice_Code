package MethodOverriding;

import java.sql.SQLOutput;

class Animal {
    void makeSound(){
        System.out.println(" I am a animal");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        super.makeSound();
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        super.makeSound();
    }
}
public class DemoOverriding {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.makeSound();

    }
}
