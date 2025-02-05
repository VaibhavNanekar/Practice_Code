package inheritance;
 class Parent {
     void information(){
         System.out.println("Parents");
     }
 }
class Child extends Parent{
    void student(){
        System.out.println("Child");
    }

    public static void main(String args[]){

        Child obj = new Child();
        obj.information();
        obj.student();
    }
}

