package Excersise2;

import java.util.Scanner;

public class EvenOddModulas {
    public static void main(String[] args) {
        Scanner AB = new Scanner(System.in);
        System.out.println("enter a number");
        int number = AB.nextInt();
        System.out.println(number % 2 == 0 ?"even":"odd");
    }

}

