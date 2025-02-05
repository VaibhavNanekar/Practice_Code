package MultiLevelInheritance;

public class FarmingTools {
    void tool(){
        System.out.println("Important Farming Tools");
    }
}
class Tools1 extends FarmingTools{
    void plow(){
        System.out.println("For ploughing");
    }
}
class Tools2 extends FarmingTools {
    void sowingmac() {
        System.out.println("For Sowing");
    }

    public static void main(String[] args) {
        Tools2 obj = new Tools2();
        Tools1 obj1 = new Tools1();
        obj.tool();
        obj.sowingmac();
        obj1.plow();
    }
}