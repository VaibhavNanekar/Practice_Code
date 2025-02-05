package inheritance;

class Employee {
    void work() {
        System.out.println("Working");
    }
}
class Manager extends Employee{
    void manage(){
        System.out.println("Managing");
    }
    public static void main(String args[]){
        Manager mn = new Manager();
        mn.work();
        mn.manage();
    }
}