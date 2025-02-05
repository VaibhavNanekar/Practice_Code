package MethodOverriding;

import javax.sound.midi.Soundbank;

class First{
 void m1(){
     System.out.println("First Class");
 }
}
class Second extends First{
    @Override
    void m1() {
        System.out.println("Second Class");
    }
}

public class DemoOne {
    public static void main(String[] args) {
        Second s=new Second();
        s.m1();

    }
}
