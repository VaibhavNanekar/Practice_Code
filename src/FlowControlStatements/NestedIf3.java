package FlowControlStatements;

public class NestedIf3 {
    public static void main(String[] args) {
        int age = 25;
        int height = 180;

        if (age > 18) {
            System.out.println("You are an adult.");
            if (height > 170) {
                System.out.println("You are tall.");
            } else {
                System.out.println(" not tall.");
            }
        } else {
            System.out.println("not an adult.");
        }
    }
}
