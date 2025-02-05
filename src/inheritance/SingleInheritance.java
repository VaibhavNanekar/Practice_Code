package inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        abc obj=new abc();
        obj.add(  5,  6);

    }
}
 class abc extends SingleInheritance {
    int add(int a, int b){
        int c=a+b;
        System.out.println("addition"+c);
        return c;
    }

 }
