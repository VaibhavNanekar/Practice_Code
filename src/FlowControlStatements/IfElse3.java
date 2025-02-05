package FlowControlStatements;

import java.util.Scanner;

public class IfElse3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Mark : ");
        int mark = sc.nextInt() ;
        if ( mark <= 100 && mark >=90) {//true
            System.out.println("A");
        }
        else if(mark <=90 && mark>=80){
            System.out.println("B");
        }else if(mark <=80 && mark >=70){
            System.out.println("C");
        } else if (mark <=70 && mark >= 60) {
            System.out.println("D");

        } else if (mark<=60) {
            System.out.println("fail");

        }else{
            System.out.println("Please Enter Correct mark");
        }

    }
}
