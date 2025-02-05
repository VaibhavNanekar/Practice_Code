package MultiLevelInheritance;

public class Colours {
    void colour(){
        System.out.println("Colours");
    }
}
class Red extends Colours{
    void red(){
        System.out.println("Red");
    }
}
class Orange extends Colours{
    void orange(){
        System.out.println("Orange");
    }
    public static void main(String args[]){
        Orange obj = new Orange();
        Red obj1 = new Red();
        obj.colour();
        obj.orange();
        obj1.red();
    }
}
