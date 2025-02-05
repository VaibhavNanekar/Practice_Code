package VariableTypes;

public class VariablesInJava {

    void t1(){
        t2();
    }
    void t2(){
         t1();
    }

    public static void main(String[] args) {
        VariablesInJava obj = new VariablesInJava();
        obj.t1();
        obj.t2();

    }
}
