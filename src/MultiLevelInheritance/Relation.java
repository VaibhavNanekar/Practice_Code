package MultiLevelInheritance;

public class Relation {
    void boss(){
        System.out.println("Father");
    }
}
class Childerns2 extends Relation{
    void Aman(){
        System.out.println("Son");
    }
}
class Childrens1 extends Relation {
    void Shreya() {
        System.out.println("Daughter");
    }

    public static void main(String[] args) {
        Childrens1 obj = new Childrens1();
        Childerns2 obj2 = new Childerns2();
        obj.boss();
        obj.Shreya();
        obj2.Aman();

}
}