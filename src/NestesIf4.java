public class NestesIf4 {
    public static void main(String[] args) {
        String name ="mohan";
        String pass ="abc@123";
        if (name == "mohan"){
            System.out.println("correct name");
            if (pass == "abc@123"){
                System.out.println("correct password");
            }
            else{
                System.out.println("incorrect password");
            }
        }
        else {
            System.out.println("incorrect name");
        }
    }
}
