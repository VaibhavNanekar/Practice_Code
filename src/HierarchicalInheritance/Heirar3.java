package HierarchicalInheritance;
class Flowers {
    void list (){
        System.out.println("Differnt Types Of Flowers");
    }
}
class Flower1 extends Flowers{
    void red (){
        System.out.println(" Red-Rose");
    }
}
class Flower2 extends Flowers{
    void pink() {
        System.out.println(" Pink-Lotus");
    }
}
class Flower3 extends Flowers {
    void purple() {
        System.out.println(" Purple-Lavender");
    }
}
public class Heirar3 {
    public static void main(String[] args) {
        Flowers obj = new Flowers();
        obj.list();
        Flower1 obj1 = new Flower1();
        obj1.red();
        Flower2 obj2 = new Flower2();
        obj2.pink();
        Flower3 obj3 = new Flower3();
        obj3.purple();
    }
}