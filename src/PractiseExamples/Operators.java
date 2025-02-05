package PractiseExamples;

public class Operators {
    public static void main(String[] args)
    {

        // Preincrement and Postincrement
        int x =5;   //5
        int y =++x;  //6
        System.out.println(x);  // 6
        System.out.println(y);  // 6


        y=x++;    // x=7
        System.out.println(y);  // 6
        System.out.println(y);  // 6
        System.out.println(y);  //7
        y=--x;    //6
        System.out.println(y);  // 6
    }
}
