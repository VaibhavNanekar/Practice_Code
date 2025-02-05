package String;
// == equal operator amd .equal()methods in string
public class EqualOperatorAndEqualMethod {
    public static void main(String[] args) {
       /* String str1 = new String("Hello");
        String str2 = new String("Hello");

        if (str1 == str2) {
            System.out.println("str1 and str2 are the same object.");
        } else {
            System.out.println("str1 and str2 are different objects.");
        }*/
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the same content.");
        } else {
            System.out.println("str1 and str2 have different content.");
        }
    }
}
