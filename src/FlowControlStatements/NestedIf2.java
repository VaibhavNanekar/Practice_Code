package FlowControlStatements;

public class NestedIf2 {
    public static void main(String[] args) {
        int i = 20;
        if (i == 20 || i <30){
            if (i < 19)
                System.out.println("true");
            if (i > 25)
                System.out.println("true 1");
            if (i > 19)
                System.out.println("true2");
        }
        else {
            System.out.println("i is greater than 19 ");
        }
    }
}
