package PractiseExamples;


    public class Demo {

        public static void main(String[] args) {

            System.out.println("main() method of MyClass");
            OtherClass obj = new OtherClass();
        }
    }

    class OtherClass {

        public OtherClass() {

            // Call the main() method of MyClass
            String[] arguments = new String[] {"123"};
            Demo.main(arguments);
        }
    }


