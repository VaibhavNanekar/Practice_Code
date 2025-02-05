package Excersise2;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 11; i <= 30; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.println(i);
        }

    }
}
