package MultiLevelInheritance;

import javax.crypto.Mac;
import java.awt.*;

public class OperatingSystem {
    void os(){
    System.out.println("Type of OperatingSystem");
}
}
class Windows extends OperatingSystem{
    void user1(){
        System.out.println("Windows");
    }
}
class Linux extends OperatingSystem{
    void user2(){
        System.out.println("Linux");
    }
    public static void main(String[] args) {
        Linux obj = new Linux();
        Windows obj1 = new Windows();
        obj.os();
        obj.user2();
        obj1.user1();

    }
}