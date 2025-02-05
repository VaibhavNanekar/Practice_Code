package methods121;

public class Callingmethod {
    public static void main(String[] args) {
        Callingmethod obj = new Callingmethod();
        int b = 100;
        int a = obj.xyz() + 50;
        System.out.println("value of a is"+a);
        System.out.println(" Calling Method In Java");

    }
    int xyz(){
        int result = 15 * 10;
        System.out.println("result of calling square method is"+result);
        return result;
    }
    void abc() {
        System.out.println();
        return;
    }
}
