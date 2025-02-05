package String;

public class DemoString2 {
    public static void main(String[] args) {
        String s ="HELLO";
        String s2 ="Hello";
        String s3 ="HELLO";

        System.out.println(s.equals(s2));//False Content is same bt case is different

        System.out.println(s.equalsIgnoreCase(s2));//true due to ignoring case (Uppercase and Lowercase)

        if (s.equals(s3)){
            System.out.println("Both are Same");
        }
        else{
            System.out.println("Both are Unequal");
        }
    }
}
