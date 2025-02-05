package Exercise4;

public class Test6 {
    static int a;
    static  void m1(int a)
    {
        a=Test6.a;
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        System.out.println(a);
        m1(50);
        System.out.println(a);
    }
}