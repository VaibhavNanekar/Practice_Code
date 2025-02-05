package HierarchicalInheritance;

class HOD {
    void pqr() {
        System.out.println("Class Ownwer");
    }
}

class Teacher extends HOD{

    void pqr1() {
        System.out.println("Teacher");
    }
}

class Student extends HOD {
    void pqr2() {
        System.out.println("Studentt");
    }
}

public class Heirar2 {
    public static void main(String[] args) {
        HOD obj = new HOD();
        obj.pqr();

        Teacher teacher = new Teacher();
        teacher.pqr1();

        Student student = new Student();
        student.pqr2();
    }
}