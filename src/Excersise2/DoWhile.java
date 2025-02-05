package Excersise2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner a1=new Scanner(System.in);
        int number;
        do {
            System.out.println("enter positive number");
            number = a1.nextInt();
            if (number > 0) {
                System.out.println("enter:" + number);
            }
        }
        while(number!=-1);
        System.out.println("loop");


    }

}

