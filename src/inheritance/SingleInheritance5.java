package inheritance;


class Nexon{
    void company(){
        System.out.println("Nexon");
    }
}
class Car extends Nexon{
    void machine(){
        System.out.println("Car");
    }
    public static void main(String args[]){
        Car obj = new Car();
        obj.company();
        obj.machine();
    }
}