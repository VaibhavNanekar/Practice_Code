package Upcasting;
class One{
    void a1(){
        System.out.println("class one ");
    }
}
class Two extends One{

    @Override
    void a1() {
        super.a1();
    }

    void a2() {
        System.out.println("Class two");


    }
}
public class UpcastingOverriding {
    public static void main(String[] args) {
        One o =(One) new Two();
      //  Two t = (Two) new One();
        o.a1();

       // o.a1();
         // t.a1();
    }
}
