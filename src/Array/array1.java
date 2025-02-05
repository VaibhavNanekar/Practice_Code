package Array;

public class array1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 7, 30, 25};

        int max = numbers[0]; // Assume the first element is the largest
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
