package Exercise4;

public class Test5 {
    static int a;
    static  void m1(int a)
    {
        Test5.a=a;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        System.out.println(a);
        m1(50);
        System.out.println(a);
    }
}
