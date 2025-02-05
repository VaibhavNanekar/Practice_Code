package Excersise2;

public class LargestNumber {
    public static void main(String[] args) {
        int num1=9;
        int num2=4;
        int num3=15;
        if(num1>num2 & num2>num3){
            System.out.println(num1+"is a largest number");
        }
        else if(num2>num3){
            System.out.println(num2+"is a largest number");
        }
        else{
            System.out.println(num3+"is a largest");
        }

    }
}
