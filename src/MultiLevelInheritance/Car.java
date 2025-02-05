package MultiLevelInheritance;

public class Car {
    void info(){
    System.out.println("Car");
}
}
class Mahindra extends Car{
    void model(){
        System.out.println("XUV");
    }
}
class Toyato extends Car{
    void model2(){
        System.out.println("fortuner");
    }
    public static void main(String args[]){
        Toyato obj = new Toyato();
        Mahindra obj1 = new Mahindra();
        obj.info();
        obj1.model();
        obj.model2();
    }
}

