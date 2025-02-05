public class breakStatement {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 14, 20, 25, 30};

        for (int num : numbers) {
            if (num % 5 == 0) {
                System.out.println("First multiple of 5 found: " + num);
                break;
            }

        }

    }
}