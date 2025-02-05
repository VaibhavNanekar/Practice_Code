package inheritance;


    class College{

    void degree(){
        System.out.println("degree Completed");
    }
}
    class School extends College {
        void basic() {
            System.out.println("School completed");
        }

        public static void main(String args[]) {

            School obj = new School();
            obj.degree();
            obj.basic();
        }
    }
