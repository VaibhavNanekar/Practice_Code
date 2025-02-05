package FlowControlStatements;

public class NestedIf1 {
    public static void main(String[] args) {
        int i = 10;

        if (i == 10 || i > 15) {

            if (i > 15)
                System.out.println("i is greater than 15");

            if (i < 12)
                System.out.println(
                        "i is smaller than 12 too");
            if (i > 9)
                System.out.println("i is greater than 9");

            if (i == 10)
                System.out.println("i is equal to 10");


        }
        else{
            System.out.println("i is less than 15");
        }
    }
}
