package Abstraction;

abstract class Car{
    abstract void avg ();
    void gear(){
        System.out.println("my gear is 5");
    }
}

class BMW extends Car{

    @Override
    void avg() {
        System.out.println("my avg is 10 per 1km");
    }
}
class Fortuner extends Car{

    @Override
    void avg() {
        System.out.println("my avg is 15 per 1km");
    }
}
public class HierarClas {
    public static void main(String[] args) {
     BMW obj = new BMW();
     obj.avg();
     obj.gear();

     Fortuner obj1 = new Fortuner();
     obj1.avg();
     obj1.gear();
    }
}
