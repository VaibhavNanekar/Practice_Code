package inheritance;

public class Laptop {
    public void portable(){
    System.out.println("Laptop ");
}
}
class Computer extends Laptop {
    void processing() {
        System.out.println("Computer ");
    }

    public static void main(String args[]) {
        Computer obj = new Computer();
        obj.processing();
        obj.portable();

    }
}
