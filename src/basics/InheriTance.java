package basics;

public class InheriTance {

    private int id;
    private String name;

    public InheriTance(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "InheriTance{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        InheriTance obj1 = new InheriTance(101, "bahir");
        Object obj = new InheriTance(101, "bahir");
        if(obj1.equals(obj)){
            System.out.println("correct");
        }else {
            System.out.println("error");
        }
//        obj1.setId(101);
//        obj.setName("naj");


    }
}
