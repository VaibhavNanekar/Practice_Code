package OverloadingAndOverriding;

public class Main2 {
    static void show(int a,int b)
    {
        System.out.println("Static Method");
    }
     void show(int a,String i){
        System.out.println("non-static method");
    }

    public static void main(String[] args) {
        Main2 obj = new Main2();
        obj.show(101,"gh");
        Main2.show(1 ,2);
    }
}



