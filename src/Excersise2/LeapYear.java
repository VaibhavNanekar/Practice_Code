package Excersise2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("enter a year");
        int year=aa.nextInt();
        if((year % 4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+"is a leap year.");
        }
        else{
            System.out.println(year+"is a not leap year");
        }

    }
}
