package Excersise2;

import java.util.Scanner;

public class EvenIncDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Enter the second number: ");
        int end = sc.nextInt();

        if (start < end) {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = start; i >= end; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }

            }

        }
    }
}